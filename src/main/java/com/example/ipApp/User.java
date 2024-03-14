package com.example.ipApp;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
    private int id;
    private String first_name;
    private String middle_name;
    private String last_name;
    private Long number;
    private String email;
    private String password;
}
