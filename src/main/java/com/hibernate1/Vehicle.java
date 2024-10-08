package com.hibernate1;

import jakarta.persistence.Embeddable;

@Embeddable
public class Vehicle {

	private String carName;
	private String bikemodel;

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getBikemodel() {
		return bikemodel;
	}

	public void setBikemodel(String bikemodel) {
		this.bikemodel = bikemodel;
	}

	public Vehicle(String carName, String bikemodel) {
		super();
		this.carName = carName;
		this.bikemodel = bikemodel;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Vehicle [carName=" + carName + ", bikemodel=" + bikemodel + "]";
	}

}
