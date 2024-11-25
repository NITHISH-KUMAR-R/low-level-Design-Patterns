package com.designpattern.lld.proxyPattern;

public class RealImageSubject implements ImageSubject {
    public String fileName;

    public RealImageSubject(String fileName) {
        this.fileName = fileName;
        loadingFromDisk();
    }

    public void loadingFromDisk(){
        System.out.println("Loading image from Disk and keeping it in Proxy cached server");
    }

    @Override
    public void display() {
        System.out.println("Image Name: "+fileName);

    }
}
