package com.tnsif.day6.staticvariable;

public class EmployeeDemo {
	public static void main(String[] args) {
		// Create the first object of the class and pass the two arguments with type
		// string and int.
		System.out.println(Employee.companyName);
		Employee e = new Employee("Keerthi", 123);
		System.out.println(e);
		
		// Similarly, create the second object of the class and pass the two arguments.
		e = new Employee("SK", 321);
		System.out.println(e);
	}
}
