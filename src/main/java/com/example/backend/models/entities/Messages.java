package com.example.backend.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Messages {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="message", nullable = false)
    private String message;

    @Column(name="title", nullable = false)
    private String title;

    @Column(name="author", nullable = false)
    private long author;
}
