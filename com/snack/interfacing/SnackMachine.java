package com.snack.interfacing;
import com.snack.component.Card;

public interface SnackMachine {

    void insertMoney(Money money);
    void insertCard(Card Card);
    long selectItem(int keypad);
    void reset();
}