package com.springboot.springboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    @RequestMapping("/courses")
    public List<Course> retrieveCourses(){
        return Arrays.asList(new Course(1,"Math","Vikas"),
                new Course(2,"Chemistry","Nishad"),
                new Course(3,"Physics","H C Verma")

        );
    }

}
