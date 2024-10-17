package com.NiranjanSpringdb.NiranjanSpringdb.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Bike {

    @Id
    @Column(name="ID")
    @GeneratedValue
    private int id;

  //  @Column(name="Bike_Name")
    private String name;
    
    //@Column(name="Bike_Name")
    private String model;
}
