package org.garage.car.democar.controller;

import java.util.List;

import org.garage.car.democar.model.Car;
import org.garage.car.democar.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Santosh Behera
 *
 */

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class CarRestController {

	@Autowired
	private CarService carService;
	

	@GetMapping("/api/cars")
	public List<Car> getCars() {
		List<Car> cars = carService.retrieveCars();
		return cars;
	}

	@GetMapping("/api/car/{chassisNumber}")
	public Car getCar(@PathVariable(name = "chassisNumber") String chassisNumber) {
		return carService.getCar(chassisNumber);
	
	}
	
	@PostMapping("/api/car")
	public void saveCar(Car car) {
		carService.saveCar(car);
	}

}
