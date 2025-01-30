package com.designpattern.lld.decorator2;

abstract  class PizzaDecorator implements  Pizza{
    protected  Pizza pizza;
    PizzaDecorator(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public Double cost() {
        return pizza.cost();
    }

    @Override
    public String getDescription() {
        return pizza.getDescription();
    }
}
