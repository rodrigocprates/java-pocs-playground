package com.rptech.springredissample.service;

import com.rptech.springredissample.entity.SwimEvent;
import com.rptech.springredissample.repository.SwimEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SwimEventService {

    @Autowired
    private SwimEventRepository repository;

    @Cacheable(cacheNames = "SwimEvent", key="#root.method.name") // cache list
    public List<SwimEvent> findAll() {
        ArrayList<SwimEvent> list = new ArrayList<>();
        repository.findAll().iterator().forEachRemaining(list::add);
        return list;
    }

    @Cacheable(cacheNames = "SwimEvent", key="#id") // cache each event found
    public Optional<SwimEvent> find(Long id) {
        return repository.findById(id);
    }

    @CacheEvict(cacheNames = "SwimEvent", allEntries = true) // for each new, clear everything
    public SwimEvent save(SwimEvent swimEvent) {
        return repository.save(swimEvent);
    }

    @CachePut(cacheNames = "SwimEvent", key="#swimEvent.getId()") // if updated, updates cached entry
    public SwimEvent update(Long id, SwimEvent swimEvent) {
        swimEvent.setId(id);
        return repository.save(swimEvent);
    }

}
