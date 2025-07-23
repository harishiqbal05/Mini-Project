package com.example.CourseRegistrationSystem.service;

import com.example.CourseRegistrationSystem.model.Courses;
import com.example.CourseRegistrationSystem.model.EnrollStudents;
import com.example.CourseRegistrationSystem.repository.CourseRepo;
import com.example.CourseRegistrationSystem.repository.EnrollRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepo courseRepo;
    public List<Courses> showcourses() {
        return courseRepo.findAll();

    }
    @Autowired
EnrollRepo enrollRepo;

    public List<EnrollStudents> enrollstudents() {

         return enrollRepo.findAll();
    }

    public void regcourse(String name, String mailid, String coursename) {

        EnrollStudents enrollstd = new EnrollStudents(name,mailid,coursename);
        enrollRepo.save(enrollstd);

    }
}
