package com.designpattern.lld.strategy.payment;

public class BillerClass {
    public static void main(String a[]) {
        PaymentContext pay = new PaymentContext( new CreditCardPayment());
        pay.payAmount(500);
        pay.setPaymentStrategy(new UpiPayment());
        pay.payAmount(1000);



    }
}
