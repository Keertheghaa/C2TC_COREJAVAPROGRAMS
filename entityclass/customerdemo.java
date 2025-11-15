package com.tnsif.entityclass;

public class customerdemo {
     public static void main(String args[]) {
    	 
    	 
    	 customer c1=new customer(); // object 1 create
    	
    	 c1.setId(101); //object 1 call 
    	 c1.setCname("Keerthi");
    	 c1.setCity("Villupuram");
    	 System.out.println(c1);
    	 
    	 customer c2=new customer(); // object 2 create
    	 
    	 c2.setId(102); //object 2 call 
    	 c2.setCname("Abi");
    	 c2.setCity("Chennai");
    	 System.out.println(c2);
    	 
    	 
    	 
     }

	 
	 
}
