package com.example.beerservice;

import com.example.beerservice.dao.BeerDao;
import com.example.beerservice.model.Beer;
import com.example.beerservice.service.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;

@SpringBootApplication
public class BeerServiceApplication  {




    public static void main(String[] args) {
        SpringApplication.run(BeerServiceApplication.class, args);
    }


}
