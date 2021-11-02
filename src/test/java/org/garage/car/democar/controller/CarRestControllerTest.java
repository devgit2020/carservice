package org.garage.car.democar.controller;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.garage.car.democar.model.Car;
import org.garage.car.democar.service.CarService;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import org.test.car.democar.impl.TestDataService;

@RunWith(MockitoJUnitRunner.class)
public class CarRestControllerTest {
	

	@Mock
	CarRestController carRestController;

	@Mock
	CarService carService;


	@Test
	public void test() {
		
		assertNotNull(carService);
		assertNotNull(carRestController);
		
	}
	
	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
	}
	
	@Test
	public void testGetCars() {

		Mockito.lenient().when(carService.retrieveCars()).thenReturn(TestDataService.getCarList());

		List<Car> response = carRestController.getCars();
		
		assertNotNull(response);

	}
	
	@Test
	public void testGet_One_Car() {

		Mockito.lenient().when(carRestController.getCar(Mockito.anyString())).thenReturn(TestDataService.getCarList().get(0));

		Car response = carRestController.getCar("111456");

		assertNotNull(response);
		assertEquals("111456", response.getChassisNumber());
	}

}
