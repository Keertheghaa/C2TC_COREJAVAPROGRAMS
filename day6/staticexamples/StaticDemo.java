package com.tnsif.day6.staticexamples;

public class StaticDemo {
	//always priority goes to static block ; static block will execute first 
	//instance block
	//object inside create block called instance block 
	{
	System.out.println("instance block");
	}
	// static block 
	static {
		System.out.println("welcome to static block");
	}
	public static void main(String args[]) {
		StaticDemo s= new StaticDemo();
		StaticDemo s1=new StaticDemo();
		System.out.println("main block");
		
	}
}
