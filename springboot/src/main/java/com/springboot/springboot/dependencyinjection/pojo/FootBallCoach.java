package com.springboot.springboot.dependencyinjection.pojo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FootBallCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "Daily Wok Out from FootBallCoach";
    }
}
