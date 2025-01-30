package com.designpattern.lld.facade;

public class FacadePattern {
    public static void main(String[] args) {
        OTTPlatformFacade ott = new OTTPlatformFacade();
        ott.watchMovie("Ramasamy","Pushpa2");
    }
}
