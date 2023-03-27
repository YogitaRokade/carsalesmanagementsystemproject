package com.carsales.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.carsales.dto.CarDTO;
import com.carsales.entity.Cars;
import com.carsales.repository.CarRepository;
import com.carsales.service.CarService;

@Service
public class CarServiceImpl  implements CarService
{
	@Autowired
	private CarRepository carRepository;
	
	//for getting all cars
	@Override
	public List<Cars> getAllCars() {

		return carRepository.findAll();
	}
	
	//for adding new car into car repository
	@Override
	public Cars addCar(CarDTO cardto ){
		Cars car=Cars.builder().carName(cardto.getCarName()).model(cardto.getModel()).brand(cardto.getBrand()).engine(cardto.getEngine())
				.colour(cardto.getColour()).fuelType(cardto.getFuelType()).price(cardto.getPrice()).build();
		return carRepository.save(car);
	}
	
	// for updating car information
	@Override
	public Cars updateCars(CarDTO cardto, int carid) {
		Cars _car = carRepository.findById(carid).get();
		_car.setCarName(cardto.getCarName());
		_car.setModel(cardto.getModel());
		_car.setBrand(cardto.getBrand());
		_car.setEngine(cardto.getEngine());
		_car.setColour(cardto.getColour());
		_car.setFuelType(cardto.getFuelType());
		_car.setPrice(cardto.getPrice());
		return carRepository.save(_car);
	}

	//for getting  car by Id
	@Override
	public Cars getCarById(int carid) {
		return carRepository.findById(carid).get();
	}

	//for deleting car using Id
	@Override
	public String deleteCarById(int carid) {
		carRepository.deleteById(carid);
		return "Car deleted succesfuly";
	}


}
