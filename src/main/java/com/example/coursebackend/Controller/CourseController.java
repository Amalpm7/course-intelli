package com.example.coursebackend.Controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

    @CrossOrigin(origins = "*")
    @PostMapping("/add")
    public String addCourse(){
        return "Test";
    }
}
