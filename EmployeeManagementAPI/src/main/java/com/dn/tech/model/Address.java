package com.dn.tech.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "address")
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private int houseNo;
	private String streetName;
	private String cityName;
	private String state;
	private String country;;
	private int zipcode;
    @ManyToOne
    @JoinColumn(name = "employee_id") // Foreign key to Employee
    private Employee employee;

	
	@Override
	public String toString() {
		return "Address [id=" + id + ", houseNo=" + houseNo + ", streetName=" + streetName + ", cityName=" + cityName
				+ ", state=" + state + ", country=" + country + ", zipcode=" + zipcode + ", employee=" + employee + "]";
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public int getHouseNo() {
		return houseNo;
	}


	public void setHouseNo(int houseNo) {
		this.houseNo = houseNo;
	}


	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public int getZipcode() {
		return zipcode;
	}


	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}


	public Employee getEmployee() {
		return employee;
	}


	public void setEmployee(Employee employee) {
		this.employee = employee;
	}


	public Address(Integer id, int houseNo, String streetName, String cityName, String state, String country,
			int zipcode, Employee employee) {
		super();
		this.id = id;
		this.houseNo = houseNo;
		this.streetName = streetName;
		this.cityName = cityName;
		this.state = state;
		this.country = country;
		this.zipcode = zipcode;
		this.employee = employee;
	}


	public Address() {
		System.out.println("Address Class object Created");
	}
}
