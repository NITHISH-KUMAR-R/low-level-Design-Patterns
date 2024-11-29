package com.designpattern.lld.template;

public class GingerCoffee extends Beverage {

    @Override
    void addCondiments() {
        System.out.println("Adding Ginder Grinds");

    }

    @Override
    void brew() {
        System.out.println("Stepping the coffee ");
    }
}
