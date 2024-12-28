package com.vikas.todowebapp.ToDoListWebApp.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SayHelloController {

    @RequestMapping("/say-hello")
    @ResponseBody
    public String sayHello(){
        return "Hi! Keep Learning";
    }

//to view the jsp, add the prefix and suffix in application.properties file and add tomcat embed dependency in pom.xml
    @RequestMapping("/say-hello-jsp")
    public String sayHelloJSP(){
        return "sayHello";
    }

}
