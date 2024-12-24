package com.springboot.springboot.dependencyinjection.pojo;

import org.springframework.stereotype.Component;

@Component
public class HockeyCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Daily WorkOut from HockeyCoach";
    }
}
