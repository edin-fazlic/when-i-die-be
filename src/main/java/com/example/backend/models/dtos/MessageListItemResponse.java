package com.example.backend.models.dtos;

import java.util.List;

public class MessageListItemResponse {
    private long messageId;
    private String messageTitle;
    private String messageDescription;
    private List<Users> receivers;

}
