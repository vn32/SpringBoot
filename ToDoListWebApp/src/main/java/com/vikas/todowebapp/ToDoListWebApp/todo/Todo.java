package com.vikas.todowebapp.ToDoListWebApp.todo;

import java.time.LocalDate;
//let say we want to create a list of todos. so create a service class to have some business logic
public class Todo {
    private int id;
    private String username;
    private String description;
    private LocalDate localDate;
    private boolean done;

    public Todo(int id, String username, String description, LocalDate localDate,boolean done) {
        super();
        this.id = id;
        this.username = username;
        this.description = description;
        this.localDate = localDate;
        this.done=done;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    @Override
    public String toString() {
        return "Todo{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                ", localDate=" + localDate +
                ", done=" + done +
                '}';
    }
}
