package bootsamples.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import bootsamples.service.TaskService;


@Controller
public class MainController {
	@Autowired
	private TaskService taskService; 
	
	@GetMapping("/")
	public String home(HttpServletRequest request) {
		request.setAttribute("tasks", taskService.findAll());
		//System.out.println(taskService.findAll());
		return "index";
	}
	
	
}
