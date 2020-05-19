## Spring Data Redis sample

### Setup

- run Redis: ``docker run -it \
      --name redis \
      -p 6379:6379 \
      redis:5.0.3``

- run SpringRedisSampleApplication class

### Testing

#### H2 database at ``http://localhost:8080/h2-console/ -> (sa/<empty pass>)``

#### Run and watch log outputs (only TRACING cache level):

- ``curl http://localhost:8080`` = list not cached, computing list as "SwimEvent::findAll" in Redis and returning
- ``curl http://localhost:8080`` = list cached, returns
- ``curl http://localhost:8080/999`` = not cached, caches SwimEvent with id 999 with key "SwimEvent::999"
- ``curl http://localhost:8080/999`` = cached, return value cached
- ``curl -d '{"id": "999", "name":"English Channel Marathon Challenge", "priceBRL":"50000"}' -H "Content-Type: application/json" -X PUT http://localhost:8080/999`` = updating, then updates "SwimEvent::999" cache entry
- ``curl http://localhost:8080/999`` = cached, return value updated
- ``curl -d '{"name":"Olympic Games 2021", "priceBRL":"14000"}' -H "Content-Type: application/json" -X POST http://localhost:8080`` = saving new, whole cache cleared/invalidated
