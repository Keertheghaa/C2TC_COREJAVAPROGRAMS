package com.tnsif.day5.inheritanceexample;

public class Teacher extends Person{
	private int id;
	private String destination;
	private String session;
	
	public Teacher(String name, int age, String city, int id, String destination, String session) {
		super(name, age, city);
		this.id = id;
		this.destination = destination;
		this.session = session;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getSession() {
		return session;
	}
	public void setSession(String session) {
		this.session = session;
	}
	@Override
	public String toString() {
		return "Teacher [id=" + id + ", destination=" + destination + ", session=" + session + "Name:"+super.getName() +"Age:"+super.getAge() +"City:" +super.getCity()+"]";
	}
	
	
	

}