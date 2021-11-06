package com.github.gustavopersa.citiesapi.repository;

import com.github.gustavopersa.citiesapi.countries.Country;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface CountryRepository extends JpaRepository<Country, Long> {
    
}