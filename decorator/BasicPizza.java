package com.designpattern.lld.decorator;

public class BasicPizza implements  Pizza{


    @Override
    public String getDescription() {
        return "Normal Pizza ";
    }

    @Override
    public double cost() {
        return 5.00;
    }
}
