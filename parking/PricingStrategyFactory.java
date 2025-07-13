package com.designpattern.lld.parking;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class PricingStrategyFactory {
    public static  PricingStrategy getPricingStragegy(String contextType){
        DayOfWeek today = LocalDate.now().getDayOfWeek();

        switch (contextType.toLowerCase()){
            case  "concert":
                return new ConcertPricingStrategy();
            case "weekday":
                return new WeekDayPricing();
            case "weekend":
                if(today == DayOfWeek.SATURDAY || today == DayOfWeek.SUNDAY){
                    return new WeekEndPricingStrategy();
                }
                else{
                    return new WeekDayPricing();
                }
            default:
                throw new IllegalArgumentException("Unknown context type: need business team to decide " + contextType);
        }
    }
}
