package com.designpattern.lld.proxyPattern;

public class ProxyImageSubject implements ImageSubject {
    private RealImageSubject realImageSubject;
    String fileName;
    public ProxyImageSubject(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImageSubject == null) {
            realImageSubject = new RealImageSubject(this.fileName);
        }
        realImageSubject.display();
    }

}
