package com.example.longrunnningapi.controllers;

import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.longrunnningapi.services.LongRunningServices;

@RestController
@RequestMapping("/simulation")
public class LongRunningControllers {

    @Autowired
    private LongRunningServices longRunningServices;

    @GetMapping("/getData")
    public CompletableFuture<ResponseEntity<String>> getData() {
        return longRunningServices.getDummyData()
                .thenApply(ResponseEntity::ok);
    }
}
