package com.example.projectapplication.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Complexity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String complexityLevel;

    public Complexity(){}

    public Complexity(String complexityLevel) {
        this.complexityLevel = complexityLevel;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getComplexityLevel() {
        return complexityLevel;
    }

    public void setComplexityLevel(String complexityLevel) {
        this.complexityLevel = complexityLevel;
    }

    @Override
    public String toString() {
        return "Complexity{" +
                "id=" + id +
                ", complexityLevel='" + complexityLevel + '\'' +
                '}';
    }
}
