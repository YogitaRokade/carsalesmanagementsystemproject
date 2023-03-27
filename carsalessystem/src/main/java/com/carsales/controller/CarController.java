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

import com.carsales.dto.CarDTO;
import com.carsales.entity.Cars;
import com.carsales.service.CarService;
//car ralated operations

@RestController
@RequestMapping(value="/cardetails")
public class CarController {

	@Autowired
	private CarService carService;
	
	//for getting all cars
	@GetMapping("/car")
	public ResponseEntity<List<Cars>> getAllCars() {
		List<Cars> car = this.carService.getAllCars();
		return new ResponseEntity<>(car, HttpStatus.OK);
	}
	
	//add new car into car repository
	@PostMapping("/car")
	 public ResponseEntity<Cars> addCar(@RequestBody @Valid CarDTO cardto)
	 {
		return new ResponseEntity<>(carService.addCar(cardto),HttpStatus.CREATED);
	 }
	
	//update car information by id
	@PutMapping("/car/{carid}")
	public Cars updateCarInfo(@RequestBody CarDTO cardto, @PathVariable int carid) {
		return carService.updateCars(cardto, carid); 
	}
	

	//getting car by Id
	@GetMapping("/car/{carid}")
	
	public Cars getCarById(@PathVariable int carid) {
		
		return carService.getCarById(carid);
	}
	

//for deleting customer by id	
	@DeleteMapping("/car/{carid}")
	public String deleteCarById(@PathVariable int carid)
	{
		return carService.deleteCarById(carid);
	}
}
