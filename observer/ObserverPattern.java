package com.designpattern.lld.observer;

public class ObserverPattern {

    public static void main(String[] args) {

        WeatherStationPublisher publisher = new WeatherStationPublisher();
        PhoneSubscriber phone = new PhoneSubscriber();
        TvSubscriber tv = new TvSubscriber();
        WebsiteSubscriber websiteSubscriber  = new WebsiteSubscriber();
        publisher.addObserver(phone);
        publisher.addObserver(tv);
        publisher.addObserver(websiteSubscriber);

        phone.weatherUpdate("sunny");
        tv.weatherUpdate("sunny");
        websiteSubscriber.weatherUpdate("sunny");

    }
}
