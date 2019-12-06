package com.example.projectapplication.mysql;

import com.example.projectapplication.entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MySqlProjectRepository extends JpaRepository<Project, Long> {


}
