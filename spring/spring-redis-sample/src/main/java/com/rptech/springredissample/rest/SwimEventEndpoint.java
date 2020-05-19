package com.rptech.springredissample.rest;

import com.rptech.springredissample.entity.SwimEvent;
import com.rptech.springredissample.service.SwimEventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SwimEventEndpoint {

    @Autowired
    private SwimEventService service;

    @GetMapping
    public List<SwimEvent> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<SwimEvent> find(@PathVariable("id") Long id) {
        return service.find(id).map(se -> ResponseEntity.ok(se)).orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<SwimEvent> update(@PathVariable("id") Long id, @RequestBody SwimEvent swimEvent) {
        return ResponseEntity.status(HttpStatus.OK).body(service.update(id, swimEvent));
    }

    @PostMapping
    public ResponseEntity<SwimEvent> save(@RequestBody SwimEvent swimEvent) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(swimEvent));
    }


}
