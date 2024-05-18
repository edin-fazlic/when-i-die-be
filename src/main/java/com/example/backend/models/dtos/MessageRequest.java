package com.example.backend.models.dtos;

import java.util.List;

public class MessageRequest {
    private String title;
    private String text;
    List<Long> receivers;
}
