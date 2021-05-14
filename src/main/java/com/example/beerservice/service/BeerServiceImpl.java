package com.example.beerservice.service;

import com.example.beerservice.dao.BeerDao;
import com.example.beerservice.model.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BeerServiceImpl implements BeerService{

    private BeerDao beerDao;

    @Autowired
    public BeerServiceImpl(BeerDao beerDao) {
        this.beerDao = beerDao;
    }

    @Override
    public Beer createBeer(Beer beer) {
        return beerDao.createBeer(beer);
    }

    @Override
    public List<Beer> displayAllBeer() {
        return beerDao.displayAllBeer();
    }
}
