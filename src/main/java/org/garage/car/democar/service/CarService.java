package org.garage.car.democar.service;

import java.util.List;

import org.garage.car.democar.model.Car;


 
/**
 * @author Santosh Behera
 *
 */
public interface CarService {
	
 public List<Car> retrieveCars();
  
 public Car getCar(String chassisNumber);
  
 public void saveCar(Car carEntity);
  
 }
