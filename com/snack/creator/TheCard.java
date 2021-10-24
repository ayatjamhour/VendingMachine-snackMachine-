package com.snack.creator;

import com.snack.interfacing.Carding;
import com.snack.service.CardService;

public class TheCard {
    public static Carding getCard() {
        return new CardService();
    }
}