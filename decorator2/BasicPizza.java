package com.designpattern.lld.decorator2;

public class BasicPizza implements  Pizza{
    @Override
    public String getDescription() {
        return "Basic-Pizza ";
    }

    @Override
    public Double cost() {
        return 5.0;
    }
}
