package com.snack.masseges;

public class NotFound extends RuntimeException {

    private String message;

    public NotFound(String message) {
        super(message);
        this.message = message;
    }
    public String getMessage() {
        return this.message;
    }
}