package com.designpattern.lld.chainofResPattern;

public class CreditCard extends PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if(amount>=1001 && amount <=10000){
            System.out.println("Credit card section can process this payment");
        }else{
            System.out.println("No one can process the payment further");
            next.handlePayment(amount);
        }
    }
}
