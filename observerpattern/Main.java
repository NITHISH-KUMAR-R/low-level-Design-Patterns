package com.designpattern.lld.observerpattern;

public class Main {

    public  static  void main(String a[]){
        Stock stock = new Stock("Gold",4000.00);
        Investor nithish = new Investor("Nithish");
        Investor dinesh = new Investor("dinesh");

        stock.registerObserver(nithish);
        stock.registerObserver(dinesh);
        stock.setStockPrice(45000.00);

    }
}
