package com.rptech.micrometerinfluxsample.service;

import com.rptech.micrometerinfluxsample.model.Country;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class CountryService {

    public List<Country> list() {
        return Arrays.asList(new Country("Brazil"), new Country("Italy"));
    }

}
