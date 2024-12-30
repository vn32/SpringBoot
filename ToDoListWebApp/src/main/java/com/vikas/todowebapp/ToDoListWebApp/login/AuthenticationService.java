package com.vikas.todowebapp.ToDoListWebApp.login;

import org.springframework.stereotype.Service;

@Service
public class AuthenticationService {
    public boolean authenticate(String name,String password){
         boolean isValidUserName=name.equalsIgnoreCase("vikas");
         boolean isValidPassword=password.equalsIgnoreCase("dummy");
         return isValidPassword && isValidUserName;
    }
}
