package com.designpattern.lld.chainofResponsibility;

public class L1SupportHandler implements SupportHandler{
    private SupportHandler nextHandler;

    @Override
    public void handleRequest(Request request) {
        if(request.getPriority()==Priority.LOW){
            System.out.println("Yes its based on l1 support we can process the request");
        }else if(request!=null){
            System.out.println("Not handled here moving to l2");
            nextHandler.handleRequest(request);
        }
    }

    @Override
    public void setNextHandler(SupportHandler supportHandler) {
        this.nextHandler=supportHandler;
    }


}
