package com.carsales.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carsales.dto.CustomerDTO;
import com.carsales.entity.Customer;
import com.carsales.service.CustomerService;

//customer controller

@RestController
@RequestMapping(value="/customerdetails")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	//for getting all customer
	@GetMapping("/customer")
	public ResponseEntity<List<Customer>> getAllCustomer() {
		List<Customer> customer = this.customerService.getAllCustomer();
		return new ResponseEntity<>(customer, HttpStatus.OK);

	}

	//for adding new customer
	@PostMapping("/customer")
	 public ResponseEntity<Customer> addCustomer(@RequestBody @Valid CustomerDTO customerdto)
	 {
		return new ResponseEntity<>(customerService.addCustomer(customerdto),HttpStatus.CREATED);
	 }
	
	//for updating information of customer
	@PutMapping("/customer/{customerId}")
	public Customer UpdateCustomerInfo(@RequestBody CustomerDTO customerdto, @PathVariable int customerId) {
		
		return customerService.updateCustomerInfo(customerdto, customerId);
	}
	//for finding customer by Id
	@GetMapping("/customer/{customerId}")
	public Customer getCustomerById(@PathVariable int customerId) {
		
		return customerService.getCustomerById(customerId);

	}
	
//for deleting customer by id
	@DeleteMapping("/customer/{customerId}")
	public String deleteCustomerById(@PathVariable int customerId)
	{
		return customerService.deleteCustomerById(customerId);
	}
}



