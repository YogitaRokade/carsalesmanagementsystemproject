package com.carsales.service;

import java.util.List;

import com.carsales.dto.CarDTO;
import com.carsales.entity.Cars;

public interface CarService  {
	
	//for getting all cars
	List<Cars>getAllCars();
	
	//for adding new car into car repository
	Cars addCar(CarDTO cardto);
	
	// for updating car information
	Cars updateCars(CarDTO cardto, int carid);

	//for getting  car by Id
	Cars getCarById(int carid);
	
	//for deleting car using Id
	String deleteCarById (int carid);

}
