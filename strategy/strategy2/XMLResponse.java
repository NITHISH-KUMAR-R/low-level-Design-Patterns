package com.designpattern.lld.strategy.strategy2;

public class XMLResponse implements  ResponseStrategy{
    @Override
    public void responseStructure(String responseInputData) {
        System.out.println("Returning Response in XML format");
        System.out.println(responseInputData);
    }
}
