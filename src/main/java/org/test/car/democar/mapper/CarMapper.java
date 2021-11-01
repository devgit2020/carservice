package org.test.car.democar.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.test.car.democar.entity.CarEntity;
import org.test.car.democar.model.Car;

@Mapper(componentModel = "spring")
public interface CarMapper {

	CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

	public  Car mapToModel(CarEntity obj);
	
	public  CarEntity mapToEntity(Car obj);

}
