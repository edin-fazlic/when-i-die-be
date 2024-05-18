package com.example.backend.models.entities;

import java.rmi.server.UID;
import java.util.Date;

public class Users{
    private long uid;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String status;
    private Date last_loged_in;
}

