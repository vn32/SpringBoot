package com.vikas.todowebapp.ToDoListWebApp.todo;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    static {
        todos.add(new Todo(1,"vikas","learn spring boot",
                LocalDate.now().plusYears(1),false));
        todos.add(new Todo(2,"vikas","learn DSA",
                LocalDate.now().plusYears(2),false));
        todos.add(new Todo(3,"vikas","learn SQL",
                LocalDate.now().plusYears(3),false));
    }

    public List<Todo> getTodos() {
        return todos;
    }
}
