package org.garage.car.democar.mapper;

import org.garage.car.democar.entity.CarEntity;
import org.garage.car.democar.model.Car;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface CarMapper {

	CarMapper INSTANCE = Mappers.getMapper(CarMapper.class);

	public  Car mapToModel(CarEntity obj);
	
	public  CarEntity mapToEntity(Car obj);

}
