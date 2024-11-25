package com.designpattern.lld.proxyPattern;

public class ClientMain {
    public static void main(String[] args) {
        ImageSubject img = new ProxyImageSubject("nithish45.jpg");
    img.display();
    img.display();
    }



}
