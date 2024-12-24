package com.springboot.springboot.dependencyinjection.Controllers;

import com.springboot.springboot.dependencyinjection.pojo.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SetterInjectionController {
    private Coach newCoach;
    @Autowired
//    public void setNewCoach(@Qualifier("footBallCoach")Coach newCoach) {
    public void setNewCoach(Coach newCoach) {
        this.newCoach = newCoach;
    }
    @GetMapping("/getDailyWorkOutBySetter")
    public String getDailyWorkOut(){
        return newCoach.getDailyWorkOut();
    }

}
