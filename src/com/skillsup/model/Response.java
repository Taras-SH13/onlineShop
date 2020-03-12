package com.skillsup.model;

public class Response <T> {
    T date;
    boolean success;
    String errorMessage;

    public Response(User user, boolean success, String errorMessage) {
        this.date = date;
        this.success = success;
        this.errorMessage = errorMessage;
    }
}
