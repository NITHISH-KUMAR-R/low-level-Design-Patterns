package com.designpattern.lld.parking;

import java.util.Scanner;

public class PricingStrategyPatternMainClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Pricing Context (concert / weekday / weekend )");
        String contextType = sc.nextLine().trim();


            PricingStrategy pricingStrategy = PricingStrategyFactory.getPricingStragegy(contextType);
            System.out.println("Enter No of hours Parked");
            int hour = sc.nextInt();
            double price  = pricingStrategy.calculatePrice(hour);
            System.out.println("Total Parking fee "+price);


    }
}
