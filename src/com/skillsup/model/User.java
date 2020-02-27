package com.skillsup.model;

public class User {
    private String username;
    private String password;
    private UserRole userRole;
    private int age;

    public User(String password, UserRole userRole,String username) {
        this.password = password;
        this.userRole = userRole;
        this.username=username;
    }


    }

