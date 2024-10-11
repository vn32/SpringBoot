package com.springboot.springboot.constructorinjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {
    //create a private field for the dependency
    private Coach myCoach;

    //define a constructor for the dependency injection
    @Autowired
    public CoachController(Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/getDailyWorkOut")
    public String getDailyWorkOut(){
        return myCoach.getDailyWorkOut();
    }

}
