package com.snack.service;

import com.snack.interfacing.Carding;
import com.snack.massege.NotEnoughMoney;
import com.snack.component.Card;

public class CardService implements CardService {

    public boolean decAmount(Card card, long amount) {
        if (newCMoney < 0) {
            throw new NotEnoughMoney ("not enough money , please try again !");
        }
        card.setCMoney(newCMoney);
        return true;
    }
}