package com.vikas.springoot.learn_jpa_and_hibernate.course.jpa;

import com.vikas.springoot.learn_jpa_and_hibernate.courseEntity.Course;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
@Transactional //must have if we are working with JPA
public class CourseJpaRepository {
    //@Autowired same as but while using jpa prefer this
    @PersistenceContext
    private EntityManager entityManager;

    //insertion using jpa
    public void insert(Course course){
        entityManager.merge(course);
    }
    //find by id
    public Course findById(long id){
        return entityManager.find(Course.class,id);
    }
    //delete by id
    public void deleteById(long id){
        Course course = entityManager.find(Course.class,id);
        entityManager.remove(course);
    }


}
