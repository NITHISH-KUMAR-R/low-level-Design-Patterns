package com.designpattern.lld.abstractFactory;

public class MacFactory implements GuiFactory{

    @Override
    public Button creataButton() {
        return new MacPainting();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacPainting();
    }
}
