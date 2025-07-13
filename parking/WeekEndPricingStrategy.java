package com.designpattern.lld.parking;

public class WeekEndPricingStrategy implements PricingStrategy{
    private  double WEEKEND_RATE = 75.00;


    @Override
    public double calculatePrice(long durationInHours) {
        return WEEKEND_RATE*durationInHours;
    }
}
