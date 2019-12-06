package com.example.projectapplication.entities;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Set;

@Entity
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;
    private String description;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "task")
    private Set<SubTask> subtasks;

    @OneToOne
    @JoinColumn(name = "complexity_id", referencedColumnName = "id")
    private Complexity complexity;

    @OneToOne
    @JoinColumn(name = "tax_id", referencedColumnName = "id")
    private Tax tax;

    @ManyToOne
    @JoinColumn(name = "project_id", referencedColumnName = "id", nullable = false)
    private Project project;

    public Task(){}

    public Task(String name, String description, Project project, Tax tax, Complexity complexity) {
        this.name = name;
        this.description = description;
        this.project = project;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<SubTask> getSubtasks() {
        return subtasks;
    }

    public void setSubtasks(Set<SubTask> subtasks) {
        this.subtasks = subtasks;
    }

    public void addSubtasks(SubTask... subTasks){
        this.subtasks.addAll(Arrays.asList(subTasks));
    }

    public Complexity getComplexity() {
        return complexity;
    }

    public void setComplexity(Complexity complexity) {
        this.complexity = complexity;
    }

    public Tax getTax() {
        return tax;
    }

    public void setTax(Tax tax) {
        this.tax = tax;
    }

    public Project getProject() {
        return project;
    }

    public void setProject(Project project) {
        this.project = project;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", subtasks=" + subtasks +
                ", complexity=" + complexity +
                ", tax=" + tax +
                '}';
    }
}
