package com.designpattern.lld.strategy.strategy2;

public class JSONResponse implements  ResponseStrategy{
    @Override
    public void responseStructure(String responseInputData) {
        System.out.println("Returning Response in JSON format");
        System.out.println(responseInputData);
    }
}
