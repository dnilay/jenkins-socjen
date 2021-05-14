package com.example.beerservice.service;

import com.example.beerservice.model.Beer;

import java.util.List;

public interface BeerService {
    public Beer createBeer(Beer beer);
    public List<Beer> displayAllBeer();
}
