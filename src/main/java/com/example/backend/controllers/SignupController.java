package com.example.backend.controllers;

import com.example.backend.CreateUser;
import com.example.backend.models.entities.Users;
import com.example.backend.services.SignupService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

@RequestMapping
public class SignupController {

    private final SignupService signupService;

    public SignupController(SignupService signupService) {
        this.signupService = signupService;
    }

    @PostMapping()
    public void makeAccount(CreateUser newuser) {
        Users newUser=new Users(newuser.getName(),newuser.getSurname(), newuser.getEmail(), newuser.getPassword(),"alive", new Date() ,true );
        this.signupService.createUser(newUser);
    }
}
