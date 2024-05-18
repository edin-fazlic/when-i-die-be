package com.example.backend.controller;

import com.example.backend.models.dtos.MessageRequest;
import com.example.backend.models.dtos.TrustedPersonResponse;
import com.example.backend.models.dtos.UserWhoTrustsMeResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tp")
public class TPController {

    public TPController() {}

    @GetMapping("/all")
    public ResponseEntity<List<TrustedPersonResponse>> getAllTPs() {

        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<TrustedPersonResponse> getTPById(@PathVariable Long id) {

        return null;
    }

    @PostMapping("/{id}")
    public ResponseEntity<TrustedPersonResponse> updateTP(@PathVariable Long id, @RequestBody MessageRequest request) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TrustedPersonResponse> deleteTP(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/create")
    public ResponseEntity<TrustedPersonResponse> createTP(@RequestBody MessageRequest request) {
        return null;
    }

    @GetMapping("/trust-me")
    public ResponseEntity<List<UserWhoTrustsMeResponse>> getTrustMe() {
        return null;
    }

}
