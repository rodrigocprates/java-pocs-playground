package com.rptech.springasyncoperations.controller;

import com.rptech.springasyncoperations.service.MyService;
import com.rptech.springasyncoperations.util.LogUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {

    @Autowired
    private MyService service;

    @GetMapping("/sync")
    public ResponseEntity sync() throws InterruptedException {
        LogUtil.log("Calling RestController#sync()");
        Thread.sleep(3000L);
        return ResponseEntity.ok(service.fetchSomethingSync());
    }

    @GetMapping("/async/void")
    public ResponseEntity asyncVoid() {
        LogUtil.log("Calling RestController#asyncVoid()");
        service.simpleAsyncCall();
        return ResponseEntity.accepted().body("async method called");
    }

    @GetMapping("/async/returnType")
    public ResponseEntity asyncWithReturnType() throws InterruptedException {
        LogUtil.log("Calling RestController#asyncVoid()");

        while(!service.asyncMethodWithReturnType().isDone()) {
            System.out.println("waiting.. ");
        }
        return ResponseEntity.accepted().body("async method with returnType called");
    }

}
