package com.greymatter.spring6restmvc.services;

import com.greymatter.spring6restmvc.model.Beer;

import java.util.UUID;

public interface BeerService {
    Beer getBeerById(UUID id);
}
