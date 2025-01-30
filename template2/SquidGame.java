package com.designpattern.lld.template2;

public class SquidGame extends  Game{
    @Override
    void startPlay() {
        System.out.println("Squid Game Started with Players of 456");
    }

    @Override
    void endPlay() {
        System.out.println("Squid game ended with 1 Player");
    }
}
