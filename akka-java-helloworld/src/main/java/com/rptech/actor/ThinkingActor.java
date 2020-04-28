package com.rptech.actor;

import akka.actor.AbstractActor;
import akka.actor.Props;

public class ThinkingActor extends AbstractActor {
    private String id;

    public ThinkingActor(String id) {
        this.id = id;
    }

    public static Props props(String text) {
        return Props.create(ThinkingActor.class, text);
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder().matchAny((msg) -> {
            System.out.println("Msg received from " + getSender());
            System.out.println("Msg is: " + msg);
            System.out.println("The address of current actor is: " + getSelf());
            System.out.println("I'm a thinker, so let me see..");


        }).build();
    }
}
