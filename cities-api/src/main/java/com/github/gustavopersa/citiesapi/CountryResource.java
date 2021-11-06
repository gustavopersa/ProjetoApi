package com.github.gustavopersa.citiesapi;

import com.github.gustavopersa.citiesapi.countries.Country;

import java.awt.print.Pageable;
import com.github.gustavopersa.citiesapi.repository.CountryRepository;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/countries")
public class CountryResource {


    private CountryRepository repository;

    public CountryResource(final CountryRepository repository) {
        this.repository = repository;
    }
    @GetMapping
    public Page<Country> countries(Pageable page) {
        return repository.findAll((org.springframework.data.domain.Pageable) page);
    }
}
