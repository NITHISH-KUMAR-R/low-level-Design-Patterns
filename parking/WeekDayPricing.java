package com.designpattern.lld.parking;

public class WeekDayPricing implements PricingStrategy{
    private double WEEKDAY_RATE = 50;
    @Override
    public double calculatePrice(long durationInHours) {
        return this.WEEKDAY_RATE * durationInHours;
    }
}
