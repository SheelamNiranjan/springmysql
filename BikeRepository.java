package com.NiranjanSpringdb.NiranjanSpringdb.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.NiranjanSpringdb.NiranjanSpringdb.Entity.Bike;

public interface BikeRepository extends JpaRepository<Bike, Integer> {

}
