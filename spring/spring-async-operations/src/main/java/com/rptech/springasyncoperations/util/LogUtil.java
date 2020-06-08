package com.rptech.springasyncoperations.util;

public class LogUtil {

    public static void log(String msg) {
        System.out.println(">> " + msg + ". Thread ID: " + Thread.currentThread().getId());
    }

}
