package com.example.backend.controller;

import com.example.backend.models.dtos.MessageListItemResponse;
import com.example.backend.models.dtos.MessageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {

    public MessageController() {}

    @GetMapping("/all")
    public ResponseEntity<List<MessageListItemResponse>> getAllMessages() {

        return null;
    }

    @GetMapping("/{id}")
    public ResponseEntity<MessageRequest> getMessageById(@PathVariable Long id) {

        return null;
    }

    @PostMapping("/{id}")
    public ResponseEntity<MessageRequest> updateMessage(@PathVariable Long id, @RequestBody MessageRequest request) {
        return null;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MessageRequest> deleteMessage(@PathVariable Long id) {
        return null;
    }

    @PutMapping("/create")
    public ResponseEntity<MessageRequest> createMessage(@RequestBody MessageRequest request) {
        return null;
    }


}
