package com.example.backend.repositories;

import com.example.backend.models.entities.MessagesReceiver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageReceiverRepository extends JpaRepository<MessagesReceiver, Long> {

}
