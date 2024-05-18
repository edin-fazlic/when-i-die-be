package com.example.backend.services;

import com.example.backend.models.dtos.TrustedPersonResponse;
import com.example.backend.models.dtos.UsersWhoTrustsMeResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TPCService {
    public ResponseEntity<List<TrustedPersonResponse>> getAllTPs() {
        return null;
    }

    public ResponseEntity<TrustedPersonResponse> getTPById(Long id) {
        return null;
    }

    public ResponseEntity<TrustedPersonResponse> updateTP(Long id) {
        return null;
    }

    public ResponseEntity<TrustedPersonResponse> deleteTP(Long id) {
        return null;
    }

    public ResponseEntity<TrustedPersonResponse> createTP() {
        return null;
    }

    public ResponseEntity<List<UsersWhoTrustsMeResponse>> getTrustMe() {
        return null;
    }
}
