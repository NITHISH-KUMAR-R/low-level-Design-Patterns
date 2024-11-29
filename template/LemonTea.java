package com.designpattern.lld.template;

public class LemonTea extends Beverage {
    @Override
    void addCondiments() {
        System.out.println("Adding Lemon Syrup");
    }

    @Override
    void brew() {
        System.out.println("Stepping the tea ");
    }
}
