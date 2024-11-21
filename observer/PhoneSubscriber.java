package com.designpattern.lld.observer;

public class PhoneSubscriber implements Observer {
    @Override
    public void weatherUpdate(String weather) {
        System.out.println("Phone received weather update: "+weather);
    }
}

 class TvSubscriber implements Observer {
    @Override
    public void weatherUpdate(String weather) {
        System.out.println("TV received weather update: "+weather);
    }
}

class WebsiteSubscriber implements Observer {
    @Override
    public void weatherUpdate(String weather) {
        System.out.println("Website received weather update: "+weather);
    }
}

