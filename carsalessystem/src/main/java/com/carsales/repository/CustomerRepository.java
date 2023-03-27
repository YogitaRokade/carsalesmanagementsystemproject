package com.carsales.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.carsales.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
