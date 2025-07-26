package com.example.CourseRegistrationSystem.service;

import com.example.CourseRegistrationSystem.repository.UserRepository;
import com.example.CourseRegistrationSystem.UserPrincipal;
import com.example.CourseRegistrationSystem.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailService implements UserDetailsService {
    @Autowired
    UserRepository userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserModel userModel = userRepo.getByUsername(username);
        if (userModel == null) {
            throw new UsernameNotFoundException("no usernamefound");
        }
        return new UserPrincipal(userModel);
    }
}
