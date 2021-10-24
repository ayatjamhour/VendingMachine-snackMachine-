package com.snack.masseges;

public class SoldOut extends RuntimeException {

    private String message;

    public SoldOut(String message) {
        super(message);
        this.message = message;
    }
    public String getMessage() {
        return this.message;
    }
}