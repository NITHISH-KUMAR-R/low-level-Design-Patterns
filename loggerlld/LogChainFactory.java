package com.designpattern.lld.loggerlld;

public class LogChainFactory {

    public static  Logger loggerChain(){
        Logger info = InfoLogger.getInstance();
        Logger debug = DebugLogger.getInstance();
        Logger error = ErrorLogger.getInstance();

        error.setNext(info);
        info.setNext(debug);

        return error;



    }
}
