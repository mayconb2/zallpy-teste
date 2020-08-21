package com.zallpy.tasks.maycon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zallpy.tasks.maycon.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
