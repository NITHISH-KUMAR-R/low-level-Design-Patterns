package com.designpattern.lld.chainofResponsibility;

public interface SupportHandler {
     void handleRequest(Request request);
     void setNextHandler(SupportHandler supportHandler);

}
