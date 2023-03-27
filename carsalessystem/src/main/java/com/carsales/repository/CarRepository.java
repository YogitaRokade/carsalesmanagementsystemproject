package com.carsales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carsales.entity.Cars;

public interface CarRepository extends JpaRepository<Cars, Integer> {

}
