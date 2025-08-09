package com.designpattern.lld.strategy.payment;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public PaymentContext(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy strategy){
        this.paymentStrategy=strategy;
    }

    public void payAmount(int amount){
        if(paymentStrategy==null){
            System.out.println("Payment Mode not set");
            throw new IllegalArgumentException("Payment Mode is not set");
        }
        paymentStrategy.pay(amount);
    }
}
