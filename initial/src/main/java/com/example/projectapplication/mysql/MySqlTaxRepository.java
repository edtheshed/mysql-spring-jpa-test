package com.example.projectapplication.mysql;

import com.example.projectapplication.entities.Tax;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MySqlTaxRepository extends JpaRepository<Tax, Long> {
}
