package com.designpattern.lld.decorator2;

public class CheesePizza extends PizzaDecorator{

    CheesePizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" Cheese-Added ";
    }

    @Override
    public Double cost() {
        return super.cost()+10.0;
    }
}
