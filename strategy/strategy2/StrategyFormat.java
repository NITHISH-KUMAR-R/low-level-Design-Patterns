package com.designpattern.lld.strategy.strategy2;

public class StrategyFormat {
    private ResponseStrategy responseStrategy;
    public StrategyFormat(ResponseStrategy responseStrategy){
        this.responseStrategy  = responseStrategy;
    }
    public void execute(String inputData) {
        responseStrategy.responseStructure(inputData);
    }
}
