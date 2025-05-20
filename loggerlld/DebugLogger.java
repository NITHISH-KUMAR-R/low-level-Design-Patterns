package com.designpattern.lld.loggerlld;

public class DebugLogger extends  Logger{

    private  static  volatile DebugLogger instance;
    private DebugLogger(){
        this.logLevel = LogLevel.DEBUG;
    }

    public static  DebugLogger getInstance(){
        if(instance ==null){
            synchronized (DebugLogger.class){
                if(instance==null){
                    instance = new DebugLogger();
                }
            }
        }

        return instance;
    }

    @Override
    protected void write(String message) {

        System.out.println("log message: "+message);

    }
}
