package com.example.backend.models.entities;

import jakarta.persistence.*;

public class MessageReceivers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "users", referencedColumnName = "id", nullable = false)
    private long receiver;

    @ManyToOne
    @JoinColumn(name = "users", referencedColumnName = "id", nullable = false)
    private long message;
}
