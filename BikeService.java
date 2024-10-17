package com.NiranjanSpringdb.NiranjanSpringdb.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.NiranjanSpringdb.NiranjanSpringdb.Entity.Bike;
import com.NiranjanSpringdb.NiranjanSpringdb.Repository.BikeRepository;

@Service
public class BikeService {

    @Autowired
    public BikeRepository bikeRepository;

    public Bike addBikeDetails(Bike bike){
        return  bikeRepository.save(bike);
    }
}
