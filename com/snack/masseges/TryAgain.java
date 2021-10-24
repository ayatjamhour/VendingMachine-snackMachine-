package com.snack.masseges;

public class TryAgain extends RuntimeException {

    private String message;

    public TryAgain(String message) {
        super(message);
        this.message = message;
    }
    public String getMessage() {
        return this.message;
    }
}