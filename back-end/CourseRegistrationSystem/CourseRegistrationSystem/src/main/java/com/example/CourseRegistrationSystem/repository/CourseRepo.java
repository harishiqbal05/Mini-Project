package com.example.CourseRegistrationSystem.repository;

import com.example.CourseRegistrationSystem.model.Courses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Courses,Integer> {

}
