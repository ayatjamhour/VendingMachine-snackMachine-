package com.snack.masseges;

public class InsertCard extends RuntimeException {

    private String message;

    public InsertCard(String message) {
        super(message);
        this.message = message;
    }
    public String getMessage() {
        return this.message;
    }
}