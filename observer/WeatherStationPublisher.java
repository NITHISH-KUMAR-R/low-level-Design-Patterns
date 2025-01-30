package com.designpattern.lld.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationPublisher implements WeatherStation {

    String weather;

    List<Observer> listOfSubscribers = new ArrayList<>();

    public void addObserver(Observer observer){
        listOfSubscribers.add(observer);
    }

    public void removeObserver(Observer observer){
        listOfSubscribers.remove(observer);
    }

    public void notifyObservers(){
        for(Observer os : listOfSubscribers){
            os.weatherUpdate(weather);
        }
    }

    public  void setWeather(String weather){
        this.weather = weather;
        notifyObservers();
    }


}
