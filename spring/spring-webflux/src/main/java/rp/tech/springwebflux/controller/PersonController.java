package rp.tech.springwebflux.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import rp.tech.springwebflux.model.Person;
import rp.tech.springwebflux.repository.PersonRepository;

@RestController
@RequestMapping("/people")
public class PersonController {

    @Autowired
    private PersonRepository personRepository;

    @GetMapping("/{id}")
    private Mono<Person> get(@PathVariable Long id) {
        return personRepository.findById(id);
    }

    @GetMapping
    private Flux<Person> getAll() throws InterruptedException {
        return personRepository.findAll();
    }
}
