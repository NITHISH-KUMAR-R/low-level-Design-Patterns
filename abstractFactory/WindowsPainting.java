package com.designpattern.lld.abstractFactory;

public class WindowsPainting implements Button,CheckBox{

    @Override
    public void paint() {
        System.out.println("Painting button in windows Style");
    }

    @Override
    public void paintCheckBox() {
        System.out.println("Painting checkbox in windows Style");
    }
}
