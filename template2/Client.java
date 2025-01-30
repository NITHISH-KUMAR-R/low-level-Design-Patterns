package com.designpattern.lld.template2;

public class Client {
    public static void main(String[] args) {
        Game game1 = new SquidGame();
        game1.play();
        Game cricket = new Cricket();
        cricket.play();
    }
}
