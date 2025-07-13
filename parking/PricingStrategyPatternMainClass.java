package com.designpattern.lld.parking;

public class PricingStrategyPatternMainClass {

    public static void main(String[] args) {
        PriceCalculator priceCalculator = new PriceCalculator(new ConcertPricingStrategy());
        System.out.println(priceCalculator.getPrice(2));

        priceCalculator.setPricingStrategy(new WeekEndPricingStrategy());
        System.out.println(priceCalculator.getPrice(2));
        priceCalculator.setPricingStrategy(new WeekDayPricing());
        System.out.println(priceCalculator.getPrice(2));
    }
}
