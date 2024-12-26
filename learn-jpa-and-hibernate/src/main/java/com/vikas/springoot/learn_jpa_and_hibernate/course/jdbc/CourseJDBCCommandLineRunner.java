package com.vikas.springoot.learn_jpa_and_hibernate.course.jdbc;

import com.vikas.springoot.learn_jpa_and_hibernate.courseEntity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//it will run the sql query at the start of the spring boot application

@Component
public class CourseJDBCCommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJDBCRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1,"Learn AWS","Vikas Nishad"));
        repository.insert(new Course(2,"Learn Spring Boot","Vikas Nishad"));
        repository.insert(new Course(3,"Learn SQL","Vikas Nishad"));
        //DELETE BY ID
        repository.deleteById(1);
        //select by id
        System.out.println(repository.findById(2));
        System.out.println(repository.findById(3));
    }
}
