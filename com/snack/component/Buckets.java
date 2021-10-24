package com.snack.component;
import com.snack.interfacing.Money;
import java.util.stream.Collectors;

import java.util.List;


public class Buckets {

    private Item item;
    private Card card;
    private List<Money> monies;
    

    public Buckets(Item item) {
        this.item = item;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }
    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }
    public List<Money> getMonies() {
        return monies;
    }

    public void setMonies(List<Money> monies) {
        this.monies = monies;
    }

}