package com.example.projectapplication.mysql;

import com.example.projectapplication.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MySqlTaskRepository extends JpaRepository<Task, Long> {
}
