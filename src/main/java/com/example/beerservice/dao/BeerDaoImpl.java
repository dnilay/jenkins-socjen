package com.example.beerservice.dao;

import com.example.beerservice.model.Beer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

@Repository
@EnableTransactionManagement
public class BeerDaoImpl implements BeerDao{

    private EntityManager entityManager;

    @Autowired
    public BeerDaoImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public Beer createBeer(Beer beer) {
        entityManager.persist(beer);
        return beer;
    }

    @Override
    public List<Beer> displayAllBeer() {
        Query query=entityManager.createQuery("SELECT B FROM Beer B");
        return query.getResultList();
    }

    @Override
    public Beer getBeerById(Integer beerId) {
        return entityManager.find(Beer.class,beerId);
    }
}
