package com.designpattern.lld.decorator;

public class Customerorder {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        pizza = new ChickenPizza(pizza);
        System.out.println("Pizza des: "+pizza.getDescription() + "cost: "+pizza.cost());
    }
}
