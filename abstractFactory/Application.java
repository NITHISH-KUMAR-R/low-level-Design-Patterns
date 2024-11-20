package com.designpattern.lld.abstractFactory;

public class Application {
    private Button button;
    private CheckBox checkBox;

    public Application(GuiFactory factory){
        button = factory.creataButton();
        checkBox = factory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkBox.paintCheckBox();
    }

    public static void main(String[] args) {

        GuiFactory factory;
        String os ="mac";

        if(os.equals("windows")){
            factory = new WindowsFactory();
        }else{
            factory = new MacFactory();
        }
        Application app = new Application(factory);
        app.paint();



    }
}
