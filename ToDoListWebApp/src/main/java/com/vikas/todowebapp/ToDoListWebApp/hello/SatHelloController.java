package com.vikas.todowebapp.ToDoListWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SatHelloController {

    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hi! Keep Learning";
    }

}
