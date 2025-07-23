package com.example.CourseRegistrationSystem.controller;

import com.example.CourseRegistrationSystem.model.Courses;
import com.example.CourseRegistrationSystem.model.EnrollStudents;
import com.example.CourseRegistrationSystem.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "http://localhost:5500")
@RestController
public class courseController {
    @Autowired
    CourseService courseService;

    @GetMapping("/courses")
    public List<Courses> showcourses() {
        return courseService.showcourses();

    }

    @GetMapping("/courses/enrolled")
    public List<EnrollStudents> enrollstudents() {
        return courseService.enrollstudents();

    }

    @PostMapping("/courses/register")
    public String regcourse(@RequestParam("Name") String name,
                          @RequestParam("EmailId") String mailid,
                         @RequestParam("CourseName") String coursename){
       courseService.regcourse(name,mailid,coursename);
       return "contragulation!!!!  " +name;
    }


}