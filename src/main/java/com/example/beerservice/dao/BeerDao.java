package com.example.beerservice.dao;

import com.example.beerservice.model.Beer;

import java.util.List;

public interface BeerDao {
    public Beer createBeer(Beer beer);
    public List<Beer> displayAllBeer();

}
