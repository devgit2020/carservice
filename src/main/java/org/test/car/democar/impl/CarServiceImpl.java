package org.test.car.democar.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.test.car.democar.entity.CarEntity;
import org.test.car.democar.model.Car;
import org.test.car.democar.repository.CarRepository;
import org.test.car.democar.service.CarService;

/**
 * @author JavaSolutionsGuide
 *
 */
@Service
public class CarServiceImpl implements CarService {

	@Autowired
	private CarRepository carRepository;

	public void setCarRepository(CarRepository carRepository) {
		this.carRepository = carRepository;
	}

	
	 public List<Car> retrieveCars() { 
		 List<CarEntity> carEntities = carRepository.findAll();
		 
		 		 
		 List<Car> cars = new ArrayList<>(); 
		 
		 carEntities.forEach( (carE) -> {
			 Car car = new Car();
			 
			 car.setBrand(carE.getBrand());
			 car.setYear_model(carE.getYear_model());
			 car.setModel(carE.getModel());
			 car.setSelling_price(carE.getSelling_price());
			 car.setChassisNumber(carE.getChassisNumber());
			 car.setDate_added(carE.getDate_added());
			 cars.add(car);
		 });
		 
		 
	  return cars;
 
	 
}

	public Car getCar(String chassisNumber) {

		Optional<CarEntity> carOptional = carRepository.findBychassisNumber(chassisNumber);
		Car carModel = new Car();
		

		if (carOptional.isPresent()) {
			//return CarMapper.INSTANCE.mapToModel(carOptional.get());
			CarEntity entity = carOptional.get();
		
			carModel.setBrand(entity.getBrand());
			carModel.setModel(entity.getModel());
			carModel.setYear_model(entity.getYear_model());
			carModel.setChassisNumber(entity.getChassisNumber());
			carModel.setBuyind_price(entity.getBuyind_price());
			carModel.setSelling_price(entity.getSelling_price());
			carModel.setDate_added(entity.getDate_added());

		} 

			return carModel;
		

	}

	public void saveCar(Car car) {
		//CarEntity carEntity = CarMapper.INSTANCE.mapToEntity(car);
		
		// The below code could be replace with MapStruct framework  
		CarEntity entity = new CarEntity();
		entity.setBrand(car.getBrand());
		entity.setModel(car.getModel());
		entity.setYear_model(car.getYear_model());
		entity.setChassisNumber(car.getChassisNumber());
		entity.setBuyind_price(car.getBuyind_price());
		entity.setSelling_price(car.getSelling_price());
		entity.setDate_added(car.getDate_added());
		

		carRepository.save(entity);
	}

}
