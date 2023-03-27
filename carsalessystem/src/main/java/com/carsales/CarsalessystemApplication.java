package com.carsales;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.carsales.entity.Cars;
import com.carsales.entity.Customer;
import com.carsales.repository.CarRepository;
import com.carsales.repository.CustomerRepository;

//main class
@SpringBootApplication
public class CarsalessystemApplication implements CommandLineRunner{
	
	@Autowired
	private CustomerRepository customerRepository;
	
	@Autowired
	private CarRepository carRepository;

	public static void main(String[] args) {
		SpringApplication.run(CarsalessystemApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Customer c1 = Customer.builder().customerId(1000).cname("yogita").email("yogita@gmail.com").phoneNumber(1234567890d).address("pune").build();
		
		Cars p11 = Cars.builder().carid(1).carName("Swift").model("2023").brand("maruti").engine("MPFI").colour("blue").fuelType("diesel").price(500000).build();
		//Cars p12 = Cars.builder().carid(2).carName("Thar").model("2020").brand("mahindra").engine("tata").colour("black").fuelType("diesel").price(170000).build();
		
		c1.setCar(Arrays.asList(p11));
		customerRepository.save(c1);
		
		
//		Customer c2 = Customer.builder().cname("swapnil").email("swap@gmail.com").phoneNumber(1234467890d)
//				.address("mumbai").build();
//		
	
		
		
//		Cars p11 = Cars.builder().carName("maruti").model("2023").brand("suzuki").engine("sdfg")
//				.colour("blue").fuelType("diesel").price(500000).build();
//		Cars p12 = Cars.builder().carName("swift").model("2020").brand("ghjgkj").engine("tata")
//				.colour("white").fuelType("diesel").price(700000).build();
//		
//		
		
//		carService.addCar(p11);
//		carService.addCar(p12);
		//customerService.addCustomer(c1);
				//customerService.addCustomer(c2);
		    
		System.out.println("---------------all saved----------------");

		
	}

}

