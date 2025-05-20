package com.designpattern.lld.loggerlld;

public abstract class Logger {

    protected  Logger next;

    protected  LogLevel logLevel;

    public void setNext(Logger next) {
        this.next = next;
    }

    public void logMessage (LogLevel level , String message){
        if(this.logLevel==level){
            write(message);
        }
        if(next!=null){
            next.logMessage(level,message);
        }
    }


    protected  abstract void  write(String message);

}
