package com.springboot.springboot;

public class Course {

    private int id;
    private String courseName;
    private String Author;

    public Course(int id, String courseName, String author) {
        this.id = id;
        this.courseName = courseName;
        Author = author;
    }

    public int getId() {
        return id;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getAuthor() {
        return Author;
    }


}
