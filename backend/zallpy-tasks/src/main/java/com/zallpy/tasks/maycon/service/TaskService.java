package com.zallpy.tasks.maycon.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.zallpy.tasks.maycon.model.Task;
import com.zallpy.tasks.maycon.repository.TaskRepository;

@Service
public class TaskService {
	
	@Autowired
	TaskRepository taskRepository;
	
	public List<Task> listTasks() {
		return taskRepository.findAll();
	}
	
	public ResponseEntity<Task> findById(Long id) {
		
		Optional<Task> task = taskRepository.findById(id);
		
		if(task.isPresent()) {
			ResponseEntity.ok(task.get());
		}
		
		return ResponseEntity.notFound().build();
	}
	
	public Task createTask(Task task) {
		return taskRepository.save(task);
	}
}
