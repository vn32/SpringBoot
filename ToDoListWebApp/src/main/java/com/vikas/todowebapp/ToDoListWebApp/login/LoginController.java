package com.vikas.todowebapp.ToDoListWebApp.login;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    //authenticate username and Password
    @Autowired
    private AuthenticationService authenticationService;
    //add a logger
    private Logger logger = LoggerFactory.getLogger(getClass());

    //http://localhost:8080/login?name=Vikas, handling request parameters by @RequestParam
//    @RequestMapping("/login")
//    public String gotoLoginPage(@RequestParam String name, Model model) {
//        //How we will pass the request parameters value into the jsp or view page, that's why model is used
//        model.addAttribute("name",name);
//        logger.debug("Request param is {} "+name);
//        return "login";
//    }

    //by default it's accepting the get method
    @RequestMapping(value="/login",method= RequestMethod.GET)
    public String gotoLoginPage() {
        return "login";
    }

    //As in the login.jsp page, form method is post, so request is Post method handled in below method
    //form data will be coming as request and can be mapped using request parameter
    @RequestMapping(value="/login",method= RequestMethod.POST)
    public String goToWelcomePage(@RequestParam String name,@RequestParam String password,Model model) {
        //let's check for the dummy username and password
        //username:vikas, password:dummy
        if(authenticationService.authenticate(name,password)){
            model.addAttribute("name",name);
            return "welcome";
        }
        model.addAttribute("errorMessage","Invalid credentials! Please try again.");
        return "login";
    }


}
