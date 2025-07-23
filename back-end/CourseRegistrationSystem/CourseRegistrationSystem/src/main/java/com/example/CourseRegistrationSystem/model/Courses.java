package com.example.CourseRegistrationSystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Courses {
    @Id
    private int CourseId;
    private String CourseName;
    private String Trainer;
    private String DurationInWeek;
}
