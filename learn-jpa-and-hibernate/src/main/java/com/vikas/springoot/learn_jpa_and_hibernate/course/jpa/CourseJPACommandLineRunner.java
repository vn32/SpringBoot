package com.vikas.springoot.learn_jpa_and_hibernate.course.jpa;

import com.vikas.springoot.learn_jpa_and_hibernate.course.jdbc.CourseJDBCRepository;
import com.vikas.springoot.learn_jpa_and_hibernate.courseEntity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//it will run the sql query at the start of the spring boot application

@Component
public class CourseJPACommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(4,"Learn AWS","Vikas Nishad"));
        repository.insert(new Course(5,"Learn Spring Boot","Vikas Nishad"));
        repository.insert(new Course(6,"Learn SQL","Vikas Nishad"));
        //DELETE BY ID
        repository.deleteById(4);
        //find by id
        System.out.println(repository.findById(5));
        System.out.println(repository.findById(6));
    }
}
