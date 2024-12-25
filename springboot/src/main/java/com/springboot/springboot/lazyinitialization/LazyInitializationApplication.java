package com.springboot.springboot.lazyinitialization;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class EagerInitialization{
    public EagerInitialization(){
        System.out.println("EagerInitialization init");
    }
}

@Lazy
@Component
class LazyInitialization{
    public LazyInitialization(){
        System.out.println("LazyInitialization init");
    }
    void someMethod(){
        System.out.println("someMethod in LazyInitialization");
    }
}


@Configuration
@ComponentScan
public class LazyInitializationApplication {

    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(LazyInitializationApplication.class);
        context.getBean(LazyInitialization.class).someMethod();
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
