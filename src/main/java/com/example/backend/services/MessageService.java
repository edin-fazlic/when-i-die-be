package com.example.backend.services;

import com.example.backend.models.dtos.MessageListItemResponse;
import com.example.backend.models.dtos.MessageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MessageService {
    public ResponseEntity<List<MessageListItemResponse>> getAllMessages() {
        return null;
    }

    public ResponseEntity<MessageRequest> getMessageById(Long id) {
        return null;
    }

    public ResponseEntity<MessageRequest> updateMessage(Long id) {
        return null;
    }

    public ResponseEntity<MessageRequest> deleteMessage(Long id) {
        return null;
    }

    public ResponseEntity<MessageRequest> createMessage() {
        return null;
    }
}
