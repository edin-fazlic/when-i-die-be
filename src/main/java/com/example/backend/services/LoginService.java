package com.example.backend.services;

import com.example.backend.models.entities.Users;
import com.example.backend.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class LoginService {

    private UserRepository userRepo;

    public LoginService(UserRepository repository) {
        this.userRepo = repository;
    }

    public Boolean loginCheck(String email, String password) {
        List<Users> search = this.userRepo.findAllByEmail(email);
        for (Users user : search) {
            if (Objects.equals(user.getPassword(), password)) return true;
        }
        return false;
    }

}
