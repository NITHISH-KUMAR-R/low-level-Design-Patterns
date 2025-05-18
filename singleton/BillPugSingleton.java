package com.designpattern.lld.singleton;

public class BillPugSingleton {

    private BillPugSingleton(){

        System.out.println("hello for first time");

    }
    public static class Singleton{

        private static final BillPugSingleton INSTANCE = new BillPugSingleton();

        public static BillPugSingleton getInstance(){

            return INSTANCE;
        }
    }
}
