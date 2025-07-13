package com.designpattern.lld.parking;

public class PriceCalculator {

    PricingStrategy pricingStrategy;

    public PriceCalculator(PricingStrategy strategy){
        this.pricingStrategy=strategy;
    }
    public void setPricingStrategy(PricingStrategy strategy){
        this.pricingStrategy= strategy;
    }
    public  double getPrice(long durationInHours){
        return pricingStrategy.calculatePrice(durationInHours);
    }
}
