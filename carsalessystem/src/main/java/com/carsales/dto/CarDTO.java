package com.carsales.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;


import com.carsales.entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
//carDTO class
public class CarDTO {
	
	@NotBlank(message = "Invalid car Name:Empty name")
	@NotNull(message = "Invalid car Name:name is null")
	private String carName;
	
	@NotBlank(message = "Invalid car model:Empty model")
	private String model;
	
	@NotBlank(message = "Invalid car brand:Empty brand")
	private String brand;
	
	@NotBlank(message = "Invalid car engine:Empty egine")
	private String engine;
	
	private String colour;
	
	private String fuelType;
	
	@NotBlank(message = "Invalid car  price:Empty name")
	private Integer price;
	
}
