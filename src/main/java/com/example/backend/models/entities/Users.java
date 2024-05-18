package com.example.backend.models.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, name="name")
    private String name;

    @Column(name="surname", nullable = false)
    private String surname;

    @Column(name="email", nullable = false)
    private String email;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="status", nullable = false)
    private String status;

    @Column(name="lastLoggedIn", nullable = false)
    private Date lastLoggedIn;

    @Column(name="isDead", nullable = false)
    private boolean isDead;
}

