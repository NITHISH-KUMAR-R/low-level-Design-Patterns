package com.designpattern.lld.factory;

public class VanDelivery implements Delivery {
    @Override
    public void deliver() {
        System.out.println("Parcel Successfully delivered via Van");
    }
}
