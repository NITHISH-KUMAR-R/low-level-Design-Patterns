package com.designpattern.lld.loggerlld;

public class InfoLogger extends Logger{

    public volatile  static  InfoLogger instance;

    private InfoLogger(){
        this.logLevel = LogLevel.INFO;
    }
    public static  InfoLogger getInstance(){
        if(instance==null){
            synchronized (InfoLogger.class){
                if(instance==null){
                    instance = new InfoLogger();
                }
            }
        }
        return instance;
    }



    @Override
    protected void write(String message) {
        System.out.println("Log message: "+message);
    }
}
