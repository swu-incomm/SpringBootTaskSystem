package bootsamples.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}