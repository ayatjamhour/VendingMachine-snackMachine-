package com.snack.component;

public class Item {
    private String name;
    private Integer enumeration;
    private long price;
    
    public Item(String name, Integer enumeration , long price) {
        this.name = name;
        this.enumeration=enumeration;
        this.price = price;
        
        
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getEnumeration() {
        return enumeration;
    }
    public void setEnumeration(Integer enumeration) {
        this.enumeration = enumeration;
    }
    public long getPrice() {
        return price;
    }
    public void setPrice(long price) {
        this.price = price;
    }


}