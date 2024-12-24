package com.springboot.springboot.dependencyinjection.Controllers;

import com.springboot.springboot.dependencyinjection.pojo.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConstructorInjectionController {
    //create a private field for the dependency
    private Coach myCoach;

    //define a constructor for the dependency injection
    //using primary and quoalifier at the different classes to check qaulifier takes high priority
    @Autowired
  public ConstructorInjectionController(@Qualifier("cricketCoach") Coach myCoach) {
        this.myCoach = myCoach;
    }

    @GetMapping("/getDailyWorkOut")
    public String getDailyWorkOut(){
        return myCoach.getDailyWorkOut();
    }

}
//if we want a default implementation of a dependency the use @Primary annotation at the top of implemented class
//@Qualifier has high priority than @Primary and we can use it both at the same time