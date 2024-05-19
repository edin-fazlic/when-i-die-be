//package com.example.backend.controllers;
//
//import com.example.backend.models.entities.AuthenticationRequestPayload;
//import com.example.backend.util.JwtUtil;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
////import org.springframework.security.authentication.AuthenticationManager;
////import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
////import org.springframework.security.core.AuthenticationException;
////import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//
//import javax.naming.AuthenticationException;
//
//@RequestMapping
//@RequiredArgsConstructor
//public class AuthController {
//    private final AuthenticationManager authenticationManager;
//    private final JwtUtil jwTokenUtill;
//
//    @PostMapping(/authenticate)
//    public ResponseEntity<AuthenticationResponsePayload> createAuthenticationToken(
//            @RequestBody AuthenticationRequestPayload payload
//    ){
//        try{
//            authenticationManager.authenticate(
//                    new UsernamePasswordAuthenticationToken(payload.getUsername(), payload.getPassword())
//            );
//        }
//        catch (AuthenticationException e){
//            e.printStackTrace();
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(new AuthenticationResponsePayload(""));
//        }
//        final String jwt = jwtTokenUtil.generateToken(payload.getUsername());
//        return ResponseEntity.ok(new AuthenticationResponsePayload(jwt));
//    }
//}