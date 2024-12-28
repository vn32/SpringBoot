package com.vikas.todowebapp.ToDoListWebApp.login;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    //http://localhost:8080/login?name=Vikas, handling request parameters by @RequestParam
    @RequestMapping("/login")
    public String gotoLoginPage(@RequestParam String name, Model model) {
        //How we will pass the request parameters value into the jsp or view page, that's why model is used
        model.addAttribute("name",name);
        return "login";
    }


}
