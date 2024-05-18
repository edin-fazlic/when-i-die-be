package com.example.backend.models.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class Settings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="deathCheck")
    private Integer deathCheck;

    @Column(name="checkAfterDays")
    private Integer checkAfterDays;

    @Column(name="deadline")
    private Date deadline;
}
