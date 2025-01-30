package com.designpattern.lld.facade;

public class SubscriptionService{
    public boolean validateSubscription(String user){
        System.out.println("Validating subscription for the user: "+ user);
        return true;
    }
}
