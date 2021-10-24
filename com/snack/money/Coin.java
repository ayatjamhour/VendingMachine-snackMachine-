package com.snack.money;
import com.snack.interfacing.Money;


public enum Coin implements Money {
    TenC(10), TwentyC(20), FiftyC(50), OneDollar(100);

    private int value;

    Coin(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Coin getCoin(int value) {
        switch (value) {
            case 10:
                return TenC;
            case 20:
                return TwentyC;
            case 50:
                return FiftyC;
            case 100:
                return OneDollar;
        }
        return null;
    }


}