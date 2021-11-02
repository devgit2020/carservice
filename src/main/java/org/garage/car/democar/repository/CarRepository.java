package org.garage.car.democar.repository;

import java.util.Optional;

import org.garage.car.democar.entity.CarEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface CarRepository extends JpaRepository<CarEntity,Long>{
	
	Optional<CarEntity> findByChassisNumber(String chassisNumber);
 
}
