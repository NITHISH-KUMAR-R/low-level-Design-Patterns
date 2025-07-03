package com.designpattern.lld.chainofResponsibility;

public class ClientClass {
    public static void main(String[] args) {
        SupportHandler l1 = new L1SupportHandler();
        SupportHandler l2 = new L2SupportHandler();
        SupportHandler l3 = new L3SupportHandler();

        l1.setNextHandler(l2);
        l2.setNextHandler(l3);

        Request r1= new Request(Priority.LOW);
        Request r2 = new Request(Priority.MEDIUM);
        Request r3 = new Request(Priority.HIGH);
        Request r4 = new Request(Priority.NONE);

        l1.handleRequest(r1);
        l1.handleRequest(r2);
        l1.handleRequest(r3);
        l1.handleRequest(r4);
    }
}
