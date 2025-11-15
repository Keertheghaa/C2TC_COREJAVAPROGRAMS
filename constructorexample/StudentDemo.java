package com.tnsif.constructorexample;

public class StudentDemo {
	public static void main(String args[]) {
		Student S1 = new Student();
		
		S1.setId(101);
		S1.setName("Keerthi");
		System.out.println(S1);
		
		Student S2= new Student(); //default constructor 
		System.out.println(S2);
		Student S3=new Student(42,"Lily"); //parameterized constructor
		System.out.println(S3);
		
	}

}
