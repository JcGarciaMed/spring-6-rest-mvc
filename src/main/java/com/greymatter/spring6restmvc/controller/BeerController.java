package com.greymatter.spring6restmvc.controller;

import com.greymatter.spring6restmvc.model.Beer;
import com.greymatter.spring6restmvc.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@Slf4j
@AllArgsConstructor
@RestController
public class BeerController {
    private final BeerService beerService;

    public Beer getBeerByUUID(UUID id){
        log.debug("get beer by id - in controller");
        return beerService.getBeerById(id);
    }

    @RequestMapping("/api/v1/beer")
    public List<Beer> listBeers(){
        return beerService.listBeers();
    }




}
