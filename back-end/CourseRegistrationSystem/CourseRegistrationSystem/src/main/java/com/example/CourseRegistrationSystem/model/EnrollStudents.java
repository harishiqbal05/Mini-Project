package com.example.CourseRegistrationSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@Entity
public class EnrollStudents {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    private String Name;
    private String EmailId;
    private String CourseName;

    public EnrollStudents(String name, String emailId, String courseName) {

       this.Name = name;
        this.EmailId = emailId;
        this.CourseName = courseName;
    }
    public EnrollStudents(){

    }
}

