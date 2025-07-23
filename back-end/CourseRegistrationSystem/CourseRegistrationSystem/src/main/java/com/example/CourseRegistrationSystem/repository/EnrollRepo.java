package com.example.CourseRegistrationSystem.repository;

import com.example.CourseRegistrationSystem.model.EnrollStudents;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrollRepo extends JpaRepository<EnrollStudents,Integer> {

}
