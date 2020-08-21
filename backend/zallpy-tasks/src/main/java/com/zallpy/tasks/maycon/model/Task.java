package com.zallpy.tasks.maycon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Task {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", nullable = false, insertable = true, updatable = false)
	private Long id;
	
	@Column(name = "description", length = 255, nullable = true, insertable = true, updatable = true)
	private String description;
	
	@Column(name = "status", length = 30, nullable = true, insertable = true, updatable = true)
	private StatusTask status = StatusTask.OPEN;
}
