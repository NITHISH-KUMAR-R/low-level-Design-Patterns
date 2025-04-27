package com.designpattern.lld.strategy.strategy2;

public class HTMLResponse  implements ResponseStrategy{
    @Override
    public void responseStructure(String responseInputData) {
        System.out.println("Returning Response in HTML format");
        System.out.println(responseInputData);
    }
}
