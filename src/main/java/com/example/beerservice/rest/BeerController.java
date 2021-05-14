package com.example.beerservice.rest;

import com.example.beerservice.model.Beer;
import com.example.beerservice.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/beers")
public class BeerController {

    private BeerService beerService;

    @Autowired
    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @PostMapping
    public ResponseEntity<Beer> createBeer(@RequestBody Beer beer)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(beerService.createBeer(beer));
    }
    @GetMapping
    public ResponseEntity<List<Beer>> displayAllBeer()
    {
        return ResponseEntity.ok(beerService.displayAllBeer());
    }
}
