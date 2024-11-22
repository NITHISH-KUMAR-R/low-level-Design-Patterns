package com.designpattern.lld.decorator;

abstract class PizzaDecorator implements  Pizza{
    protected Pizza pizza;
    public PizzaDecorator(Pizza pizza){
        this.pizza =pizza;

    }
    @Override
    public String getDescription() {
        return  pizza.getDescription();
    }

    @Override
    public double cost() {
        return pizza.cost();
    }
}
