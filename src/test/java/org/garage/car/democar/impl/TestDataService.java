package org.garage.car.democar.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.garage.car.democar.entity.CarEntity;
import org.garage.car.democar.model.Car;

public class TestDataService {

	public static List<Car> getCarList() {
		List<Car> carList = new ArrayList<>();

		Car car_1 = new Car();
		car_1.setBrand("Brand_1");
		car_1.setModel("Model_1");
		car_1.setYear_model(1990);
		car_1.setChassisNumber("111456");
		car_1.setBuyind_price(500000.00);
		car_1.setSelling_price(600000.00);
		car_1.setDate_added("20210822");

		Car car_2 = new Car();
		car_2.setBrand("Brand_2");
		car_2.setModel("Model_2");
		car_2.setYear_model(1990);
		car_2.setChassisNumber("222456");
		car_2.setBuyind_price(500000.00);
		car_2.setSelling_price(600000.00);
		car_2.setDate_added("20210822");

		Car car_3 = new Car();
		car_3.setBrand("Brand_3");
		car_3.setModel("Model_3");
		car_3.setYear_model(1990);
		car_3.setChassisNumber("333456");
		car_3.setBuyind_price(500000.00);
		car_3.setSelling_price(600000.00);
		car_3.setDate_added("20210822");

		carList.add(car_1);
		carList.add(car_2);
		carList.add(car_3);

		return carList;
	}

	public static List<CarEntity> getCarEntityList() {

		List<CarEntity> carEntityList = getCarList().stream().map(CarEntity::toCarEntity).collect(Collectors.toList());

		return carEntityList;
	}

	public static Optional<CarEntity> getCarWithMatchingChassis() {

		return Optional.of(getCarEntityList().get(0));
	}
}
