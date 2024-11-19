package com.designpattern.lld.factory;

public class BikeDelivery implements Delivery{
    @Override
    public void deliver() {
        System.out.println("Parcel successfully delivered via bike.");
    }
}
