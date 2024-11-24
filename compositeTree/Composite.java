package com.designpattern.lld.compositeTree;

import java.util.ArrayList;

public class Composite implements Component {
    String name;

    ArrayList<Component> comp;

    public Composite() {

    }

    public Composite(String name) {
        this.name = name;
        comp = new ArrayList<>();

    }



    public void addComponent(Component component) {
        comp.add(component);
    }


    @Override
    public void showPrice() {
        for (Component component : comp) {
            component.showPrice();
        }
    }
}
