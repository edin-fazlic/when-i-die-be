package com.example.backend.services;

import com.example.backend.models.entities.Users;
import com.example.backend.repositories.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class SignupService {
    private UserRepository userRepo;

    public SignupService(UserRepository repository) {
        this.userRepo = repository;
    }


    public void createUser(Users newUser){
        this.userRepo.save(newUser);
    }
}
