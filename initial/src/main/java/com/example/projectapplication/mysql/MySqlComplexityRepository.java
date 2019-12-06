package com.example.projectapplication.mysql;

import com.example.projectapplication.entities.Complexity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MySqlComplexityRepository extends JpaRepository<Complexity, Long> {
}
