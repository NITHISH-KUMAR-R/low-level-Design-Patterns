package com.designpattern.lld.ratelimitter;

public class RateLimiterTest {
    public static void main(String[] args) throws InterruptedException {
        TokenBucket rateLimiter = new TokenBucket(5, 2); // 5 max tokens, 2 tokens/sec

        for (int i = 0; i < 100; i++) {
            boolean allowed = rateLimiter.grantAccess();
            System.out.println("Request " + i + ": " + (allowed ? "Allowed" : "Blocked"));
            Thread.sleep(300); // simulate 0.3s between requests
        }
    }
}
