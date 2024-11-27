package com.designpattern.lld.chainofResponsibility;

public class L2SupportHandler implements  SupportHandler{

    private   SupportHandler nextHandler;
    @Override
    public void handleRequest(Request request) {

        if(request.getPriority()==Priority.MEDIUM){
            System.out.println("Yes we can handle l2 request .we can process this request");
        } else if(request!=null) {
            System.out.println("Not handled here moving to l3");
            nextHandler.handleRequest(request);
        }

    }

    @Override
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler =nextHandler;
    }
}
