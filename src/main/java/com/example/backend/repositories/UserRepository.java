package com.example.backend.repositories;

import com.example.backend.models.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<Users, Long> {

    List<Users> findAllByEmail(String email);


}
