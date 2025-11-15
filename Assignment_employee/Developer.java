package com.tnsif.Assignment_employee;

public class Developer extends Employee{
	private String language;
	public Developer(String name, int salary, int employeeId, String language) {
		super(name, employeeId, salary);
		this.language=language;
		
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	@Override
	public String toString() {
		return "Developer [language=" + language + "]";
	}
	

}
