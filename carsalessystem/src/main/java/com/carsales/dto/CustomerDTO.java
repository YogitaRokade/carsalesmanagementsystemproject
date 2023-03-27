package com.carsales.dto;

import java.util.List;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.carsales.entity.Cars;

import lombok.Builder;
import lombok.Data;

@Data

@Builder
//customerDTO class
public class CustomerDTO {
	
	@NotBlank(message = "Invalid Name: Empty Name")
	@NotNull(message = "Invalid Name: name is NULL")
	@Size(min = 3, max = 25, message = "Invalid Name: Must be of 3-25 characters")
	private String cname;
	
	
	@Email(message ="Invalid email")
	private String email;
	
	@NotNull(message = "Invalid Phone Number: number is NULL")
	@NotBlank(message = "Invalid Phone Number: Empty Number")
	@Pattern(regexp = "^\\d{10}$", message = "Invalid phone Number!!!!")
	private Double phoneNumber;
	
	@NotNull(message = "Invalid Address: Address is NULL")
	private String address;
	
	private List<Cars> car;
}
