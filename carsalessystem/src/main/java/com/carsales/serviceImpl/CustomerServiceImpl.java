package com.carsales.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carsales.dto.CustomerDTO;
import com.carsales.entity.Customer;
import com.carsales.repository.CustomerRepository;
import com.carsales.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired
	private CustomerRepository customerRepository;
	
	//for getting all customers
	@Override
	public List<Customer> getAllCustomer() {

		return customerRepository.findAll();
	}
	
	//for adding new customer into customer repository
	@Override
	public Customer addCustomer(CustomerDTO customerdto) {
		Customer customer = Customer.builder().cname(customerdto.getCname()).email(customerdto.getEmail())
				.phoneNumber(customerdto.getPhoneNumber()).address(customerdto.getAddress())
				.car(customerdto.getCar()).build();
		return customerRepository.save(customer);
	
	}

	// for updating customer information
	@Override
	public Customer updateCustomerInfo(CustomerDTO customerdto, int customerId) {
		Customer _customer = customerRepository.findById(customerId).get();
		_customer.setCname(customerdto.getCname());
		_customer.setEmail(customerdto.getEmail());
		_customer.setPhoneNumber(customerdto.getPhoneNumber());
		_customer.setAddress(customerdto.getAddress());
		
		return customerRepository.save(_customer);
	}

	//for getting  customer by Id
	@Override
	public Customer getCustomerById(int customerId) {
		return customerRepository.findById(customerId).get();
	}

	//for deleting customer using Id
	@Override
	public String deleteCustomerById(int customerId) {
		customerRepository.deleteById(customerId);
		return  "Customer deleted successfully";
	}

	

	
}
