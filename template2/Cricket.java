package com.designpattern.lld.template2;

public class Cricket extends Game{
    @Override
    void startPlay() {
        System.out.println("Game started India scored 229 runs in 20 Overs");
    }

    @Override
    void endPlay() {
        System.out.println("Game ended India won by 33 runs");
    }
}
