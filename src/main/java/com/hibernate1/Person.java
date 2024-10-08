package com.hibernate1;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "person_details")
public class Person {
	@Id
	@Column(name = "person_id")
	private int pId;

	@Column(name = "person_name")
	private String pName;

	@Column(name = "person_address")
	private String address;
	private Vehicle vehicles;

	public int getpId() {
		return pId;
	}

	public void setpId(int pId) {
		this.pId = pId;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Vehicle getVehicles() {
		return vehicles;
	}

	public void setVehicles(Vehicle vehicles) {
		this.vehicles = vehicles;
	}

	public Person(int pId, String pName, String address, Vehicle vehicles) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.address = address;
		this.vehicles = vehicles;
	}

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", address=" + address + ", vehicles=" + vehicles + "]";
	}

}
