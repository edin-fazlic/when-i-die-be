package com.example.backend.models.entities;

import java.rmi.server.UID;
import java.util.Date;

public class Users{
    private long id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String status;
    private Date lastLoggedIn;
}

