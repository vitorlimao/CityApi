package com.github.com.vitorlimao.cities.api.cities.resources;



import com.github.com.vitorlimao.cities.api.cities.entities.City;
import com.github.com.vitorlimao.cities.api.cities.repositories.CityRepository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RestController;

@RestController
public class CityResource {

  private final CityRepository repository;

  public CityResource(final CityRepository repository) {
    this.repository = repository;
  }

  @GetMapping("/cities")
  public Page<City> countries(Pageable page) {

    return repository.findAll(page);
  }

 

}



