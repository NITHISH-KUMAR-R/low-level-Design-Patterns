package com.designpattern.lld.observer;

public interface WeatherStation {
     void addObserver(Observer observer);
     void removeObserver(Observer observer);
     void notifyObservers();
}
