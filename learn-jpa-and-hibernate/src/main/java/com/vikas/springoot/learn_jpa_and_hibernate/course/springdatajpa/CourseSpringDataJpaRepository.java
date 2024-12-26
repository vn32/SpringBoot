package com.vikas.springoot.learn_jpa_and_hibernate.course.springdatajpa;

import com.vikas.springoot.learn_jpa_and_hibernate.courseEntity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
}
