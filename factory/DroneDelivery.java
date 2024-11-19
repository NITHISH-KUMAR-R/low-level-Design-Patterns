package com.designpattern.lld.factory;

public class DroneDelivery  implements  Delivery{
    @Override
    public void deliver() {
        System.out.println("Parcel delivered successfully via Drone");
    }

}
