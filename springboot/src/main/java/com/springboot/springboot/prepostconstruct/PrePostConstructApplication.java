package com.springboot.springboot.prepostconstruct;


import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
class SomeClass{

    SomeDependency someDependency;
    public SomeClass(SomeDependency someDependency){
        super();
        this.someDependency=someDependency;
        System.out.println("All dependencies are ready");
    }
    //we can do database connections once all the dependencies are ready
    @PostConstruct
    public void Initialize(){
        someDependency.someMethod();
    }
    //before closing the application, we can clean up code or remove database connections
    @PreDestroy
    public void close(){
        someDependency.cleanUp();
    }
}

@Component
class SomeDependency{

    void someMethod(){
        System.out.println("Initialization in SomeDependency");
    }
    public void cleanUp(){
        System.out.println("cleanup in somedependency");
    }
}


@Configuration
@ComponentScan
public class PrePostConstructApplication {

    public static void main(String[] args) {
        var context= new AnnotationConfigApplicationContext(PrePostConstructApplication.class);
        //Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
