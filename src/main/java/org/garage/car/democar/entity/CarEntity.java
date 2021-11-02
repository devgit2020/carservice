package org.garage.car.democar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.garage.car.democar.model.Car;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Santosh Behera
 *
 */
@Getter
@Setter
@Entity
@Table(name="car")
public class CarEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String brand;

	private String model;

	private Integer year_model;

	@Column(name="chassi_number")
	private String chassisNumber;

	private Double buyind_price;

	private Double selling_price;
	
	private String date_added;
	
	public static CarEntity toCarEntity(Car car) {
		CarEntity entity = new CarEntity();
		entity.setBrand(car.getBrand());
		entity.setModel(car.getModel());
		entity.setYear_model(car.getYear_model());
		entity.setChassisNumber(car.getChassisNumber());
		entity.setBuyind_price(car.getBuyind_price());
		entity.setSelling_price(car.getSelling_price());
		entity.setDate_added(car.getDate_added());

		return entity;
	}


	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getYear_model() {
		return year_model;
	}

	public void setYear_model(Integer year_model) {
		this.year_model = year_model;
	}


	public Double getBuyind_price() {
		return buyind_price;
	}

	public void setBuyind_price(Double buyind_price) {
		this.buyind_price = buyind_price;
	}

	public Double getSelling_price() {
		return selling_price;
	}

	public void setSelling_price(Double selling_price) {
		this.selling_price = selling_price;
	}

	public String getDate_added() {
		return date_added;
	}

	public void setDate_added(String date_added) {
		this.date_added = date_added;
	}

	public String getChassisNumber() {
		return chassisNumber;
	}

	public void setChassisNumber(String chassisNumber) {
		this.chassisNumber = chassisNumber;
	}



	
}
