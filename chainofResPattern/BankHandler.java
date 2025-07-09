package com.designpattern.lld.chainofResPattern;

public class BankHandler extends  PaymentHandler{
    @Override
    public void handlePayment(double amount) {
        if(amount>=1 && amount<=500){
            System.out.println("Bank can process this payment");
        }else{
            next.handlePayment(amount);
        }
    }
}
