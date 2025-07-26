package com.example.CourseRegistrationSystem.controller;

import com.example.CourseRegistrationSystem.model.EnrollStudents;
import com.example.CourseRegistrationSystem.model.UserModel;
import com.example.CourseRegistrationSystem.service.CourseService;
import com.example.CourseRegistrationSystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class Admincontroller {
    @Autowired
    CourseService courseService;

    @Autowired
    UserService userService;
    @GetMapping("/admin/courses/enrolled")
    public List<EnrollStudents> enrollstudents() {
        return courseService.enrollstudents();

    }
    @PostMapping("/admin/add-users")
    public void adduser(@RequestBody UserModel usermodel){

        userService.adduser(usermodel);
    }
}
