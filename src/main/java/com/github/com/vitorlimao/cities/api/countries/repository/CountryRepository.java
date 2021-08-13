package com.github.com.vitorlimao.cities.api.countries.repository;


import com.github.com.vitorlimao.cities.api.countries.entities.Country;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {


}
