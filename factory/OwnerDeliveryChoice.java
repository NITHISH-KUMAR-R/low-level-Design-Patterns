package com.designpattern.lld.factory;

public class OwnerDeliveryChoice {
    public static void main(String[] args) {
        Delivery bike = DeliveryHubFactory.getdelivery("bike");
        Delivery van = DeliveryHubFactory.getdelivery("van");
        Delivery drone = DeliveryHubFactory.getdelivery("drone");

        bike.deliver();
        van.deliver();
        drone.deliver();
    }
}
