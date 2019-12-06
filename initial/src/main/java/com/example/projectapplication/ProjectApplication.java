package com.example.projectapplication;

import com.example.projectapplication.entities.*;
import com.example.projectapplication.mysql.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;

@SpringBootApplication
public class ProjectApplication implements CommandLineRunner {

    @Autowired
    private MySqlProjectRepository mySqlProjectRepository;

    @Autowired
    private MySqlTaskRepository mySqlTaskRepository;

    @Autowired
    private MySqlTaxRepository mySqlTaxRepository;

    @Autowired
    private MySqlSubtaskRepository mySqlSubtaskRepository;

    @Autowired
    private MySqlComplexityRepository mySqlComplexityRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProjectApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
//        Project project = new Project("Project 1", "This is project 1");
//		projectRepository.save(project);
//		var option = projectRepository.findById(1L);
//        if (option.isPresent()) {
//            project = option.get();
//            var tax5 = taxRepository.save(new Tax(5));
//            var tax10 = taxRepository.save(new Tax(10));
//            var tax15 = taxRepository.save(new Tax(15));
//            var cMin = complexityRepository.save(new Complexity("minimum"));
//            var cMed = complexityRepository.save(new Complexity("medium"));
//            var cMax = complexityRepository.save(new Complexity("maximum"));
//            var task1 = taskRepository.save(new Task("setup cicd", "cicd stuff", project, tax5, cMin));
//            var task2 = taskRepository.save(new Task("development", "dev the app", project, tax10, cMed));
//            var task3 = taskRepository.save(new Task("release", "release it", project, tax15, cMax));
//            var subTask1 = subtaskRepository.save(new SubTask("setup jenkins", "jenkins stuff", task1));
//            var subTask2 = subtaskRepository.save(new SubTask("setup pipeline", "pipeline stuff", task1));
//            var subTask3 = subtaskRepository.save(new SubTask("setup triggers", "triggers stuff", task1));
//            var subTask4 = subtaskRepository.save(new SubTask("acceptance test", "acceptance test stuff", task2));
//            var subTask5 = subtaskRepository.save(new SubTask("integration test", "integration stuff", task2));
//        }



        Project project = mySqlProjectRepository.getOne(1L);

		System.out.println(project.toString());

//        Task task = new Task();
//        var option = taskRepository.findAll();
////		if (option.isPresent()) {
////			task = option.get();
////		}
//        for (Task tas : option) {
//            System.out.println(tas.toString());
//
//        }
    }
}
