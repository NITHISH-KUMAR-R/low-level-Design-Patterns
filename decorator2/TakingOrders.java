package com.designpattern.lld.decorator2;

public class TakingOrders {
    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        pizza = new CheesePizza(pizza);
        System.out.println("Hi Nithish you order of " +pizza.getDescription() +" Total Cost: "+pizza.cost());

    }
}
