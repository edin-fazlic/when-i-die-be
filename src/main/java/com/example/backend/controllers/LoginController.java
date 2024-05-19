package com.example.backend.controllers;

import com.example.backend.services.LoginService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
public class LoginController {
    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping()
    public boolean Login(@RequestBody String email, String password) {
        return this.loginService.loginCheck(email, password);
    }


}
