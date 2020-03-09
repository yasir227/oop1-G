package com.aiub.labexam;

public class Address {
	
	private String city;
	private String country;
	private Employee employee;
	public Address() {
		super();
	}
	public Address(String city,String country,Employee employee) {
		super();
		this.city = city;
		this.country= country;
		this.employee = employee;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
	public void printinfo() {
		
		System.out.println("City:"+ this.city);
		System.out.println("Country:"+ this.country);
		System.out.println("Employee:"+ this.employee);
		
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", country=" + country + ", employee=" + employee + "]";
	}

}
