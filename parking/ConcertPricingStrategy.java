package com.designpattern.lld.parking;

public class ConcertPricingStrategy implements  PricingStrategy{

    private double CONCERT_RATE = 100;
    @Override
    public double calculatePrice(long durationInHours) {
        return this.CONCERT_RATE * durationInHours;
    }
}
