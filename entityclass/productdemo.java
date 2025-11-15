package com.tnsif.entityclass;

public class productdemo {
   public static void main(String args[]) {
	
	 product p1=new product(); // object 1 create
 	
	 p1.setId(1); //object 1 call 
	 p1.setPname("Narzo");
	 p1.setPrice(20000);
	 
	 
	 product p2=new product(); // object 2 create
	 
	 p2.setId(2); //object 2 call 
	 p2.setPname("Samsung");
	 p2.setPrice(10000);
	
	 
     product p3=new product(); // object 3 create
	 
	 p3.setId(3); //object 3 call 
	 p3.setPname("Realme");
	 p3.setPrice(15000);
	 
	 System.out.println("First product :");
	 System.out.println(p1);
	 System.out.println("Second product :");
	 System.out.println(p2);
	 System.out.println("Third product :");
	 System.out.println(p3);
	 
	
   }

}
