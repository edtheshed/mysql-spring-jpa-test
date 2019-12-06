package com.example.projectapplication.mysql;

import com.example.projectapplication.entities.SubTask;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MySqlSubtaskRepository extends JpaRepository<SubTask, Long> {
}
