package com.example.backend.repositories;

import com.example.backend.models.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageReceiversRepository extends JpaRepository<Users, Long> {

}
