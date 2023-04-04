package com.greymatter.spring6restmvc.controller;

import com.greymatter.spring6restmvc.model.Beer;
import com.greymatter.spring6restmvc.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;

    public Beer getBeerByUUID(UUID id){
        log.debug("get beer by id - in controller");
        return beerService.getBeerById(id);
    }




}
