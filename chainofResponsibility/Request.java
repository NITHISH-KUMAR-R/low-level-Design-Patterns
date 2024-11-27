package com.designpattern.lld.chainofResponsibility;

public class Request {
    private final Priority priority;
    public Request(Priority priority){
        this.priority =priority;
    }

    public Priority getPriority(){
        return this.priority;
    }

}
