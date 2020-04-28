### Akka is Actor Model implementation on the JVM
> Toolkit for building highly concurrent, distributed, and resilient message-driven applications for Java and Scala

> Reference: https://doc.akka.io/docs/akka/current/guide/actors-motivation.html

Actors receive and send messages from any other actor in the Actor System.

Send message to an Actor:
> tell() - send message and don't expect a response
> ask() - send message and expect a message
> forward() - similar to ask(), but send of the message is kept in the message.

See also Play Framework (built on Akka): https://www.playframework.com/