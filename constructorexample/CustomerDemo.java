package com.tnsif.constructorexample;

public class CustomerDemo {
	public static void main(String args[]) {
		Customer C1=new Customer();
		C1.setId(42);
		C1.setName("Keerthi");
		C1.setCity("Chennai");
		System.out.println("First Customer");
		System.out.println(C1);
		Customer C2=new Customer();
		System.out.println("Second Customer");
		System.out.println(C2);
		System.out.println("Third Customer");
		Customer C3=new Customer(12,"Rose","Chennai");
		System.out.println(C3);
		
	}

}
