package com.snack.money;
import com.snack.interfacing.Money;


public enum MoneyPaper implements Money {
    TwentyDollar(2000), FiftyDollar(5000);

    private int value;

    MoneyPaper(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public Note getMoneyPaper(int value) {
        switch (value) {
            case 2000:
                return TwentyDollar;
            case 5000:
                return FiftyDollar;
        }
        return null;
    }
}