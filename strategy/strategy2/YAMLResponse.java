package com.designpattern.lld.strategy.strategy2;

public class YAMLResponse implements  ResponseStrategy{
    @Override
    public void responseStructure(String responseInputData) {
        System.out.println("Returning Response in YAML format");
    }
}
