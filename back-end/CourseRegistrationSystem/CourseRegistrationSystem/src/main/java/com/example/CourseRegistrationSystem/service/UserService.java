package com.example.CourseRegistrationSystem.service;

import com.example.CourseRegistrationSystem.repository.UserRepo;
import com.example.CourseRegistrationSystem.model.UserModel;
import com.example.CourseRegistrationSystem.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    BCryptPasswordEncoder pass = new BCryptPasswordEncoder(12);
    @Autowired
    UserRepo userRepo;
    public void adduser(UserModel usermodel) {
        usermodel.setPassword(pass.encode(usermodel.getPassword()));
        userRepo.save(usermodel);
    }
}
