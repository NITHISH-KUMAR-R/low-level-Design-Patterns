package com.designpattern.lld.observer;

public class ObserverPattern {

    public static void main(String[] args) {

        WeatherStationPublisher publisher = new WeatherStationPublisher();
        PhoneSubscriber phone = new PhoneSubscriber();
        TvSubscriber tv = new TvSubscriber();
        WebsiteSubscriber websiteSubscriber  = new WebsiteSubscriber();
        publisher.addObservers(phone);
        publisher.addObservers(tv);
        publisher.addObservers(websiteSubscriber);

        phone.weatherUpdate("rainy");
        tv.weatherUpdate("sunny");
        websiteSubscriber.weatherUpdate("cloudy");

    }
}
