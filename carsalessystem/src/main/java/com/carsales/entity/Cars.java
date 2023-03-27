package com.carsales.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "Cars")
// car entity class
public class Cars {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="CARID",length = 10, unique = true, nullable = false)
	private Integer carid;
	
	@Column(name="CARNAME",length=30,nullable = false )
	private String carName;
	
	@Column(name="MODEL",length=30,nullable = false )
	private String model;
	
	@Column(name="BRAND",length=30,nullable = false )
	private String brand;
	
	@Column(name="ENGINE",length=30,nullable = false )
	private String engine;
	
	@Column(name="COLOUR",length=30,nullable = false )
	private String colour;
	
	@Column(name="FUELTYPE",length=30,nullable = false )
	private String fuelType;
	
	@Column(name="PRICE",length=30,nullable = false )
	private Integer price;
	
	@ManyToOne
	//@JoinColumn(name = "customerId")
	//@JsonBackReference
	private Customer customer;
}
