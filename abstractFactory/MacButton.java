package com.designpattern.lld.abstractFactory;

public class MacButton implements Button,CheckBox{

    @Override
    public void paint() {

        System.out.println("Painting button in Mac Style");
    }

    @Override
    public void paintCheckBox() {
        System.out.println("Painting Checkbox in mac style");
    }
}
