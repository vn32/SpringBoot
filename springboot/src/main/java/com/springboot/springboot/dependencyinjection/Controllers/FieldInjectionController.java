package com.springboot.springboot.dependencyinjection.Controllers;

import com.springboot.springboot.dependencyinjection.pojo.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FieldInjectionController {
    //mostly used dependency injection type
    @Autowired
    //@Qualifier("hockeyCoach")
    private Coach myCoach;

    @GetMapping("/getDailyWorkOutByField")
    public String getDailyWorkOutByFieldInjection(){
        return myCoach.getDailyWorkOut();
    }
}
