package com.designpattern.lld.facade;

import com.designpattern.lld.strategy.SortingContext;

public class OTTPlatformFacade {
    private MovideDatabase movideDatabase;
    private SubscriptionService subscriptionService;
    private StreamingService streamingService;
    private PlayBackController playBackController;
    private LightingSystem lightingSystem;

    public OTTPlatformFacade( ) {
        this.movideDatabase = new MovideDatabase();
        this.subscriptionService = new SubscriptionService();
        this.streamingService = new StreamingService();
        this.playBackController = new PlayBackController();

        this.lightingSystem = new LightingSystem();
    }

    public void watchMovie(String user, String movieName){
        System.out.println("Watching to the OTT platform!");

        if(subscriptionService.validateSubscription(user)){
            if (movideDatabase.searchMovie(movieName)){
                lightingSystem.dimLights();
                streamingService.prepareStream(movieName);
                playBackController.startPlayback(movieName);
                System.out.println("Enjoy your movie: "+ movieName+"!\n");
            }else{
                System.out.println("Sorry the movie: " +movieName+" which you requested is not available in our platform");
            }
        }else{
            System.out.println("Subscription is invalid please renew you subscription");
        }
    }
}
