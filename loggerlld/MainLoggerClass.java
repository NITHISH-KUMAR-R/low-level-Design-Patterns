package com.designpattern.lld.loggerlld;

public class MainLoggerClass {
    public  static  void main(String args[]){
        Logger factory = LogChainFactory.loggerChain();

        factory.logMessage(LogLevel.ERROR,"Error Log");
        factory.logMessage(LogLevel.INFO,"Info  Log");
        factory.logMessage(LogLevel.DEBUG,"Debug Log ");
    }
}
