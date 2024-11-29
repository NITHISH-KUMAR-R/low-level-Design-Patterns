package com.designpattern.lld.template;

public abstract class Beverage {

    final void prepare(){
        boilWater();
        addCondiments();
        brew();
        pourInCup();


    }

    abstract void addCondiments();

    abstract void brew();

    void  boilWater() {
        System.out.println("Boiling water");
    }
    void pourInCup(){
        System.out.println("Pouring into Cup");
    }
}
