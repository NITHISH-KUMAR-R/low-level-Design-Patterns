package com.designpattern.lld.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class Stock implements  Subject{
    String stockName;
    double stockPrice;
    List<Observer> observersList;

    Stock(String stockName, double stockPrice){
        System.out.println("\n[Market] listed Price " + stockName + " price is ₹" + stockPrice);
        this.stockName=stockName;
        this.stockPrice=stockPrice;
        this.observersList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observersList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observersList.remove(o);
    }

    @Override
    public void notifyObserver() {
    for(Observer o : observersList){
            o.update(stockName,stockPrice);
    }
    }
    public void setStockPrice(double newPrice){
        System.out.println( stockName + " price changed to ₹" + newPrice);
        this.stockPrice = newPrice;
        notifyObserver();
    }
}
