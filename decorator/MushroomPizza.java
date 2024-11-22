package com.designpattern.lld.decorator;

public class MushroomPizza extends PizzaDecorator {
    public MushroomPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" Mushroom added ";
    }

    @Override
    public double cost() {
        return pizza.cost() + 50.00;
    }
}
