package com.designpattern.lld.lldrealexample.vendingmachineex;

public class Item {
    private String name;
    private int price;
    public Item(String name, int price){
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return this.price;
    }

    public String getName(){
        return this.name;
    }
}
