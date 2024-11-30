package com.designpattern.lld.factory;

public class OwnerDeliveryChoice {
    public static void main(String[] args) {
        Delivery bike = DeliveryHubFactory.getDelivery("bike");
        Delivery van = DeliveryHubFactory.getDelivery("van");
        Delivery drone = DeliveryHubFactory.getDelivery("drone");

        bike.performDelivery();
        van.performDelivery();
        drone.performDelivery();
    }
}
