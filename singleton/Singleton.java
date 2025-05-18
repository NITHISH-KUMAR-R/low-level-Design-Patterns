package com.designpattern.lld.singleton;

public class Singleton {

    private volatile static Singleton instance;

    public Singleton(){

        System.out.println("Calling for first time without instance");
    }
    public static  Singleton getInstance(){
        if (instance == null) {
        synchronized (Singleton.class){

            if(instance==null){

                instance = new Singleton();
            }
         }
        }
        return instance;
    }
}
