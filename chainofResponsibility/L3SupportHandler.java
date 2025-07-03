package com.designpattern.lld.chainofResponsibility;

public class L3SupportHandler implements  SupportHandler{
    private SupportHandler nextHandler;


    @Override
    public void handleRequest(Request request) {
        if(request.getPriority()==Priority.HIGH){
            System.out.println("Yes its based on l3 support, our l3 team can process this request");
        }else{
            System.out.println("Request cannot be handled");
        }
    }

    @Override
    public void setNextHandler(SupportHandler supportHandler) {
            this.nextHandler=supportHandler;
    }
}
