package com.designpattern.lld.decorator2;

public class OlivePizza extends PizzaDecorator{

    OlivePizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" extra Olive-added ";
    }

    @Override
    public Double cost() {
        return pizza.cost() + 20.00;
    }
}
