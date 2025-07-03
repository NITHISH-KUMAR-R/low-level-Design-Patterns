package com.designpattern.lld.lldrealexample.vendingmachineex;

import java.util.HashMap;
import java.util.Map;

public class VendingMachine {
    public State currentState;
    public Item item;
    public Map<String , Item> map;
    private int balance;

    public VendingMachine(){
        this.currentState = new IdealState();
        map = new HashMap<>();
        map.put("A1", new Item("COKE",10));
        map.put("A2", new Item("SPRITE",20));
        map.put("A3", new Item("ThumpsUp",10));
    }

    public void insertCoint(int coin){
        this.currentState.insertCoin(this,coin);
    }
    public void selectItem(String code){
        this.currentState.selectItem(this,code);
    }


    public void addBalance(int amount) {
        this.balance += amount;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int amount) {
        this.balance = amount;
    }

    public Item getItem(String code) {
        return map.get(code);
    }
}
