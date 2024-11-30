package com.designpattern.lld.factory;

public class DeliveryHubFactory{
    public static  Delivery getDelivery(String type){
        switch (type){
            case "bike" :
                return new BikeDelivery();
            case  "drone" :
                return new DroneDelivery();
            case "van" :
                return new VanDelivery();
            default:
                throw  new IllegalArgumentException( "Unknown Delivery Type");
        }
    }
}
