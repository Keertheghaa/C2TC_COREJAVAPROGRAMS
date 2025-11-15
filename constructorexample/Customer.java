package com.tnsif.constructorexample;

public class Customer {
	int id;
	String name;
	String city;
	public Customer(){
		this.id=11;
		this.name="Lily";
		this.city="Chennai";
		
	}
	public Customer(int id,String name,String city) {
		
		this.id=id;
		this.name=name;
		this.city=city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", city=" + city +  "]";
	}
	

}
