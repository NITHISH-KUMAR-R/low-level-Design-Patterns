package com.designpattern.lld.ratelimitter;

public class TokenBucket {

    public int capacity;
    public double refillRatePerSecond;
    public double tokens;
    public double lastRefillTimeStamp;

    public TokenBucket(int capacity, double refillRatePerSecond){
        this.capacity =capacity;
        this.refillRatePerSecond = refillRatePerSecond;
        this.tokens = capacity;
        this.lastRefillTimeStamp = System.nanoTime();
    }

    public synchronized boolean grantAccess(){
        refill();
        if(tokens>=1){
            tokens--;
            return true;
        }
        System.out.println("Request Failed not granted");
        return false;
    }

    private void refill() {
        double now = System.nanoTime();
        double sinceSecondsLast = (now - lastRefillTimeStamp) /1e9;
        double tokensToAdd = sinceSecondsLast * refillRatePerSecond;
        tokens = Math.min(capacity, tokens+tokensToAdd);
        lastRefillTimeStamp = now;
    }

}
