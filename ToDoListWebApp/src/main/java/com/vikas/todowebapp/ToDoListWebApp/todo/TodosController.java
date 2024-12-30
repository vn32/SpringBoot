package com.vikas.todowebapp.ToDoListWebApp.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodosController {
    @Autowired
    private TodoService todoService;

    @RequestMapping("/list-todos")
    public String listAllToDos(Model model){
        List<Todo> allTodos=todoService.getTodos();
        model.addAttribute("todos",allTodos);
        return "listTodos";
    }

}
