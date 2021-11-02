package org.garage.car.democar.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.garage.car.democar.model.Car;
import org.garage.car.democar.repository.CarRepository;
import org.garage.car.democar.service.CarService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;


@RunWith(MockitoJUnitRunner.class)
public class CarServiceImplTest {
	
	@Mock
	CarRepository carRepository;

	@InjectMocks
	CarServiceImpl carServiceImpl;
	
	
	@Test
	public void test() {
		assertNotNull(carRepository);
		assertNotNull(carServiceImpl);
	}
	
	@Test
	public void testRetrieveCars() {

		Mockito.lenient().when(carRepository.findAll()).thenReturn(TestDataService.getCarEntityList());

		List<Car> response = carServiceImpl.retrieveCars();

		assertNotNull(response);
	}
	
	@Test
	public void testGetCar() {
		
		Mockito.lenient().when(carRepository.findByChassisNumber(Mockito.anyString())).thenReturn(TestDataService.getCarWithMatchingChassis());
	
		Car response = carServiceImpl.getCar("111456");
		assertNotNull(response);   							
		assertEquals("111456", response.getChassisNumber());
	}
	

	/*@Test
	public void testSaveCar() {
		Mockito.lenient().doNothing().when(carService).saveCar(Mockito.any());
		Car car = new Car();
		carService.saveCar(car);

	}*/

	
}
