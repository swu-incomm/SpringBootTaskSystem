package bootsamples.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import bootsamples.model.Task;
import bootsamples.service.TaskService;

@RestController
public class SampleRestController {
	
	@Autowired
	private TaskService taskService; 
	
	@GetMapping("/hello")
	public String hello() {
		return "Sobin got some skills. ";
	}
	
	@GetMapping("/all-tasks")
	public String allTasks() {
		return taskService.findAll().toString();
	}
	
	//We don't use Post mapping so the parameter can be passed in the url
	@GetMapping("/save-task")
	public String saveTask(@RequestParam String name,@RequestParam String desc) {
		Task task = new Task(name, desc, new Date(), false);
		taskService.save(task);
		return "Save successful!";
	}
	
	@GetMapping("/delete-task")
	public String deleteTask(@RequestParam int id) {
		taskService.delete(id);
		return "Delete task id " + id + " successful"; 
	}
}
