package com.designpattern.lld.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationPublisher {

    String weather;

    List<Observer> listOfSubscribers = new ArrayList<>();

    public void addObservers(Observer observer){
        listOfSubscribers.add(observer);
    }

    public void remove(Observer observer){
        listOfSubscribers.remove(observer);
    }

    public void notifySubscribers(){
        for(Observer os : listOfSubscribers){
            os.weatherUpdate(weather);
        }
    }

    public  void setWeather(String weather){
        this.weather = weather;
        notifySubscribers();
    }


}
