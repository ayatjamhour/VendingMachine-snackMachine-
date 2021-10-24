package com.snack.masseges;

public class NotEnoughMoney extends RuntimeException {

    private String message;

    public NotEnoughMoney(String message) {
        super(message);
        this.message = message;
    }
    public String getMessage() {
        return this.message;
    }
}