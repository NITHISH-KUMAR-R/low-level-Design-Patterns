package com.designpattern.lld.abstractFactory;

import java.util.Scanner;

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
        Scanner sc= new Scanner(System.in);
        String input = sc.nextLine();
        //String os ="mac";

        if(input.equals("windows")){
            factory = new WindowsFactory();
        }else if(input.equals("mac")){
            factory = new MacFactory();
        }else{
             throw new IllegalArgumentException("Not desiged for given os: " + input);
        }
        Application app = new Application(factory);
        app.paint();
        sc.close();



    }
}
