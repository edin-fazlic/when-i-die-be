package com.example.backend.controller;

import com.example.backend.models.dtos.MessageListItemResponse;
import com.example.backend.models.dtos.MessageRequest;
import com.example.backend.services.MessageService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/message")
public class MessageController {

    private final MessageService messageService;

    public MessageController(MessageService messageService) {
        this.messageService = messageService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<MessageListItemResponse>> getAllMessages() {
        return messageService.getAllMessages();
    }

    @GetMapping("/{id}")
    public ResponseEntity<MessageRequest> getMessageById(@PathVariable Long id) {
        return messageService.getMessageById(id);
    }

    @PostMapping("/{id}")
    public ResponseEntity<MessageRequest> updateMessage(@PathVariable Long id, @RequestBody MessageRequest request) {
        return messageService.updateMessage(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<MessageRequest> deleteMessage(@PathVariable Long id) {
        return messageService.deleteMessage(id);
    }

    @PutMapping("/create")
    public ResponseEntity<MessageRequest> createMessage(@RequestBody MessageRequest request) {
        return messageService.createMessage();
    }


}
