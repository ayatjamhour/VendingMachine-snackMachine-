package com.snack.component;

public class Slot {
    private int num;
    private Item item;

    public Slot( Item item , int num) {
        this.item = item;
        this.num = num;
        
    }
    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

}