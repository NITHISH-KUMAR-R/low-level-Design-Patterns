package com.designpattern.lld.singleton;

public class MainClass {
    public static void main(String[] args) {
        Singleton singletonObj = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        BillPugSingleton obj3 = BillPugSingleton.Singleton.getInstance();




    }
}
