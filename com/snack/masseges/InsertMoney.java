package com.snack.masseges;

public class InsertMoney extends RuntimeException {

    private String message;

    public InsertMoney(String message) {
        super(message);
        this.message = message;
    }
    public String getMessage() {
        return this.message;
    }
}