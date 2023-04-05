package com.greymatter.spring6restmvc.services;

import com.greymatter.spring6restmvc.model.Beer;

import java.util.List;
import java.util.UUID;

public interface BeerService {
    Beer getBeerById(UUID id);
    List<Beer> listBeers();
    Beer saveNewBeer(Beer beer);
}
