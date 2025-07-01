package com.designpattern.lld.observerpattern;

public class Investor implements Observer{
    String name;
    Investor(String name){
        this.name=name;
    }
    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println(name + " notified: " + stockName + " is now ₹" + stockPrice);

    }
}
