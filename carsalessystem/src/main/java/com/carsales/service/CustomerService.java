package com.carsales.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.carsales.dto.CustomerDTO;

//import org.springframework.context.annotation.Bean;

import com.carsales.entity.Customer;
@Component
public interface CustomerService {
	
	// for display all customer
    List<Customer>getAllCustomer();
	
    //for adding new customer 
	Customer addCustomer(CustomerDTO customerdto);

	
	//for updating customer information
	Customer updateCustomerInfo(CustomerDTO customerdto, int customerId);

	//for getting customer by id
	Customer getCustomerById(int customerId);
	
	//for deleting customer by id
	String deleteCustomerById (int customerId);
}
