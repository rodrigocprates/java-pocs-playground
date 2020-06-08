package com.rptech.springasyncoperations.service;

import com.rptech.springasyncoperations.util.LogUtil;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;

import java.util.concurrent.Future;

@Service
public class MyService {
    public String fetchSomethingSync() {
        LogUtil.log("Calling MyService#fetchSomethingSync()");
        return "sync operation returned";
    }

    @Async
    public void simpleAsyncCall() {
        LogUtil.log("Calling MyService#simpleAsyncCall()");
    }

    @Async
    public Future<String> asyncMethodWithReturnType() throws InterruptedException {
        LogUtil.log("Calling MyService#asyncMethodWithReturnType()");

        Thread.sleep(3000);
        return new AsyncResult<String>("returning AsyncResult value");
    }
}
