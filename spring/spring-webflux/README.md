## Reactive endpoints POC with spring webflux, r2dbc and related 

### Notes

R2DBC (Reactive Relational Database Conectivity) - async queries into database (differently than JDBC which is synchronous)

- R2DBCConfiguration.java - enable R2dbcRepositories (PersonRepository) and creates connection with H2 db 
- PersonRepository.java extends ReactiveCrudRepository - to run CRUD operation on a repository in a 'Reactive way'

- pom.xml key dependencies:
1) spring-boot-starter-webflux - reactive web framework - non-blocking supporting Reactive Streams
2) spring-data-r2dbc - support to implement R2DBC based repositories
3) r2dbc-h2 - r2dbc implementation connectivity to H2
4) h2 - database