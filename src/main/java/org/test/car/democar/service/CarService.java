package org.test.car.democar.service;

import java.util.List;

import org.test.car.democar.model.Car;


 
/**
 * @author JavaSolutionsGuide
 *
 */
public interface CarService {
	
 public List<Car> retrieveCars();
  
 public Car getCar(String chassisNumber);
  
 public void saveCar(Car carEntity);
  
 }
