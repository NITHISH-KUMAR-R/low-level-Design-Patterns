package com.designpattern.lld.decorator;

public class ChickenPizza extends PizzaDecorator {

    public ChickenPizza(Pizza pizza) {
        super(pizza);
    }
    public String getDescription(){
        return pizza.getDescription()+" and Chicken added";

    }

    public  double cost(){
        return pizza.cost() + 120.00;
    }

}

