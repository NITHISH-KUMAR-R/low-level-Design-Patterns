package com.designpattern.lld.compositeTree;

public class Main {
    public static void main(String[] args) {
        Component hdd = new Leaf("hdd",200);
        Component keyboard = new Leaf("keyboard",50);
        Component mouse = new Leaf("mouse",150);
        Component ram = new Leaf("ram",1000);

        Composite computer = new Composite("Computer");
        Composite motherboard = new Composite("Motherboard");

        motherboard.addComponent(ram);
        Composite cabinet = new Composite("cabinet");
        Composite pheriperals = new Composite("pheripherals");
        cabinet.addComponent(hdd);
        cabinet.addComponent(motherboard);

        pheriperals.addComponent(keyboard);
        pheriperals.addComponent(mouse);

        computer.addComponent(pheriperals);
        computer.addComponent(cabinet);
        computer.showPrice();
        //motherboard.showPrice();
        //ram.showPrice();

    }
}
