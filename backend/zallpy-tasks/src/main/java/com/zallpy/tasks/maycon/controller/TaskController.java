package com.zallpy.tasks.maycon.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@GetMapping("/tasks")
	public String showTasks() {
		return "Tudo certo!";
	}
}
