package com.zallpy.tasks.maycon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.zallpy.tasks.maycon.model.Task;
import com.zallpy.tasks.maycon.service.TaskService;

@RestController
@RequestMapping(value = "/tasks")
public class TaskController {
	
	@Autowired
	TaskService service;
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@GetMapping(value = "/all")
	public List<Task> listTasks() {
		return service.listTasks();
	}
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@GetMapping(value = "/{id}")
	public ResponseEntity<Task> find(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Task createTask(@RequestBody Task task) {
		return service.createTask(task);
	}
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@PutMapping(value = "/{id}")
	public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task task){
		return service.updateTask(id, task);
	}
	
	@CrossOrigin(origins = "http://127.0.0.1:5500")
	@DeleteMapping(value = "/{id}")
	public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
		return service.deleteTask(id);
	}
	
}
