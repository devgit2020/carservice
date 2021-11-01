package org.test.car.democar.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

/**
 * @author JavaSolutionsGuide
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
