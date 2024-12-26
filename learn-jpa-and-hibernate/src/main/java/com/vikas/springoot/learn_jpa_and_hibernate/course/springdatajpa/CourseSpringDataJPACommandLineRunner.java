package com.vikas.springoot.learn_jpa_and_hibernate.course.springdatajpa;

import com.vikas.springoot.learn_jpa_and_hibernate.course.jpa.CourseJpaRepository;
import com.vikas.springoot.learn_jpa_and_hibernate.courseEntity.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

//it will run the sql query at the start of the spring boot application

@Component
public class CourseSpringDataJPACommandLineRunner implements CommandLineRunner {
    @Autowired
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.save(new Course(7,"Learn AWS","Vikas Nishad"));
        repository.save(new Course(8,"Learn Spring Boot","Vikas Nishad"));
        repository.save(new Course(9,"Learn SQL","Vikas Nishad"));
        //DELETE BY ID
        repository.deleteById(7l);
        //find by id
        System.out.println(repository.findById(8l));
        System.out.println(repository.findById(9l));
    }
}
