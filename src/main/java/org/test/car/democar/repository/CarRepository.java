package org.test.car.democar.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.test.car.democar.entity.CarEntity;
 
@Repository
public interface CarRepository extends JpaRepository<CarEntity,Long>{
	
	Optional<CarEntity> findBychassisNumber(String chassisNumber);
 
}
