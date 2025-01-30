package com.designpattern.lld.template2;

public abstract class Game {

    public final void play(){
        initialize();
        startPlay();
        endPlay();
    }
   public void initialize(){
       System.out.println("Game Initialized");
   }

    abstract void startPlay();
    abstract  void endPlay();


}
