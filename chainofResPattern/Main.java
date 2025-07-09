package com.designpattern.lld.chainofResPattern;

public class Main {
    public static  void main(String a[]){

        PaymentHandler bank = new BankHandler();
        PaymentHandler credit = new CreditCard();
        bank.setNext(credit);

        bank.handlePayment(2000.00);

    }
}
