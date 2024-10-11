package com.springboot.springboot.constructorinjection;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkOut() {
        return "get daily WorkOut from Cricket Coach";
    }
}
