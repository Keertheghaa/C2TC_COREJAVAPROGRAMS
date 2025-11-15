package com.tnsif.day6.staticexamples;

public class overloadmainmethod {
	// overload the main method 
	static void main() { // not a correct method signature
		System.out.println("mainprogram 1");
	}
	public static void main(char a) { // not a correct method signature
		System.out.println("mainprogram 2");
	}
	public static void main(String args) { // not a correct method signature
		System.out.println("mainprogram 3");
	}
	public static void main(String[] args) { // correct method signature 
		System.out.println("mainprogram 4");
	}
		
	}


// static memory created at class ;

// instance memory created at object starting default 0 ;  int = 0, boolean = false , float= 0.0l, string = null ;