package com.designpattern.lld.template;

public class ClientMain {
    public static void main(String[] args) {
        Beverage gingerCoffee = new GingerCoffee();
        gingerCoffee.prepare();
        Beverage lemonTea = new LemonTea();
        lemonTea.prepare();
    }
}
