package com.designpattern.lld.loggerlld;

public class ErrorLogger extends  Logger{

    private volatile  static ErrorLogger instance;
    private ErrorLogger(){
        this.logLevel = LogLevel.ERROR;
    }

    public static ErrorLogger getInstance(){
        if(instance==null){
            synchronized (ErrorLogger.class){
                if(instance==null){
                    instance = new ErrorLogger();
                }
            }
        }
        return instance;
    }
    @Override
    protected void write(String message) {
        System.out.println(" log message: "+message);
    }
}
