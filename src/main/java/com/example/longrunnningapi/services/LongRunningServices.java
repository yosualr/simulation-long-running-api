package com.example.longrunnningapi.services;

import java.util.concurrent.CompletableFuture;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;


@Service
public class LongRunningServices {
    @Cacheable("dummyData")
    public CompletableFuture<String> getDummyData() {
        try {
            Thread.sleep(10000); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        String dummyData = "This is some dummy data";
        return CompletableFuture.completedFuture(dummyData);
    }
}
