package com.example.backend.controller;

import com.example.backend.models.dtos.MessageRequest;
import com.example.backend.models.dtos.TrustedPersonResponse;
import com.example.backend.models.dtos.UsersWhoTrustsMeResponse;
import com.example.backend.services.TPCService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tp")
public class TPController {

    public final TPCService tpcService;

    public TPController(TPCService tpcService) {
        this.tpcService = tpcService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<TrustedPersonResponse>> getAllTPs() {
        return this.tpcService.getAllTPs();
    }

    @GetMapping("/{id}")
    public ResponseEntity<TrustedPersonResponse> getTPById(@PathVariable Long id) {
        return this.tpcService.getTPById(id);
    }

    @PostMapping("/{id}")
    public ResponseEntity<TrustedPersonResponse> updateTP(@PathVariable Long id, @RequestBody MessageRequest request) {
        return this.tpcService.updateTP(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TrustedPersonResponse> deleteTP(@PathVariable Long id) {
        return this.tpcService.deleteTP(id);
    }

    @PutMapping("/create")
    public ResponseEntity<TrustedPersonResponse> createTP(@RequestBody MessageRequest request) {
        return this.tpcService.createTP();
    }

    @GetMapping("/trust-me")
    public ResponseEntity<List<UsersWhoTrustsMeResponse>> getTrustMe() {
        return this.tpcService.getTrustMe();
    }

}
