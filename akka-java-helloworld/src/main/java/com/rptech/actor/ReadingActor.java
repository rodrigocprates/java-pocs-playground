package com.rptech.actor;

import akka.actor.AbstractActor;
import akka.actor.ActorRef;
import akka.actor.Props;

public class ReadingActor extends AbstractActor {
    private String id;

    public ReadingActor(String id) {
        this.id = id;
    }

    public static Props props(String text) {
        return Props.create(ReadingActor.class, text);
    }

    @Override
    public Receive createReceive() {
        return receiveBuilder().matchEquals("helloworld", msg -> {
            System.out.println("Msg received from " + getSender());
            System.out.println("Msg is: " + msg);
            System.out.println("The address of current actor is: " + getSelf());

            ActorRef thinkingActorRef = context().actorOf(ThinkingActor.props("thinker2"), "thinkingActor");
            thinkingActorRef.tell("hey thinker", getSelf());

            // TODO play with ask() and forward()
           /* StringBuilder builtMsg = new StringBuilder("Hey dude, did you see that msg?");
            Timeout timeout = Timeout.create(Duration.ofSeconds(10));
            Future<Object> future = Patterns.ask(thinkingActorRef, msg, timeout);
            String result = (String) Await.result(future, timeout.duration());
            System.out.println("Reading response from asker: " + result);*/

        }).build();
    }
}
