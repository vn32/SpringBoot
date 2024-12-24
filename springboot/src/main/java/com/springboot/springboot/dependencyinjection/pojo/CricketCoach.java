package com.springboot.springboot.dependencyinjection.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "get daily WorkOut from Cricket Coach";
    }
}
