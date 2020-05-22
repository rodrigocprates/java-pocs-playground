package com.rptech.micrometerinfluxsample.controller;

import com.rptech.micrometerinfluxsample.model.Country;
import com.rptech.micrometerinfluxsample.service.CountryService;
import io.micrometer.core.annotation.Timed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

@RestController
public class CountryEndpoint {

    @Autowired
    private CountryService service;

    @GetMapping
    @Timed("request.country.timed")
    public List<Country> listCountries() throws InterruptedException {
        List<Country> list = service.list();

        // sleep thread randomly between 0-3 secs
        Thread.sleep(new Random().nextInt(3000));

        return list;
    }
}
