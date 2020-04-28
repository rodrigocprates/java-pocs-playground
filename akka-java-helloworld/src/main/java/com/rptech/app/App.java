package com.rptech.app;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import com.rptech.actor.ReadingActor;
import com.rptech.actor.ThinkingActor;

public class App {

    public static void main(String[] args) {

        // an actor system defines a hierarchy of actors
        ActorSystem system = ActorSystem.create("test-system");

        ActorRef readingActorRef = system.actorOf(ReadingActor.props("id1"), "readingActor");

        readingActorRef.tell("helloworld", null /*ActorRef.noSender()*/);

        system.terminate();
    }

}
