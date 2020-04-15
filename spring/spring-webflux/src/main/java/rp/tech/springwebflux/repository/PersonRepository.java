package rp.tech.springwebflux.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import rp.tech.springwebflux.model.Person;

@Repository
public interface PersonRepository extends ReactiveCrudRepository<Person, Long> {
}
