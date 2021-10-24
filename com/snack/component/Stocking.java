package com.snack.component;
import java.util.HashMap;

public class Stocking<item1 , item2 , item3> {
    private HashMap<item1 , item2 , item3> stocking;

    public Stocking() {
        stocking = new HashMap<>();
    }
    public HashMap<item1 , item2 , item3> getStocking() {
        return stocking;
    }
    public item1 getItem(item1 keypad) {
        return stocking.getTheItem(keypad, null);
    }
    public item3 putItem(item1 item1 , item2 item2 , item3 item3) {
        return stocking.put(item1 , item2 , item3);
    }}