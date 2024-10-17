package com.NiranjanSpringdb.NiranjanSpringdb.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.NiranjanSpringdb.NiranjanSpringdb.Entity.Bike;
import com.NiranjanSpringdb.NiranjanSpringdb.Service.BikeService;

@RestController
public class BikeController {

    @Autowired
    private BikeService bikeService;

    @PostMapping("/addBikeDetails")
    public Bike addDetails(@RequestBody Bike bike){
        
        return bikeService.addBikeDetails(bike);
    }

}
