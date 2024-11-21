package com.designpattern.lld.abstractFactory;

public class WindowsFactory implements GuiFactory{

    @Override
    public Button creataButton() {
        return new WindowsPainting();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsPainting();
    }
}

