package com.tnsif.entityclass;

public class studentdemo {
	public static void main(String args[]) {
		student s1=new student(); // object 1 create
	 	
		 s1.setRollno(42); //object 1 call 
		 s1.setName("Keerthi");
		 s1.setDepartment("ECE");
		 
		 
		 student s2=new student(); // object 2 create
		 
		 s2.setRollno(45); //object 2 call 
		 s2.setName("Abi");
		 s2.setDepartment("CSE");
		 
		
		 
	     student s3=new student(); // object 3 create
		 
	     s3.setRollno(50); //object 3 call 
		 s3.setName("Lena");
		 s3.setDepartment("ECE");
		 
		 
		 System.out.println("First student :");
		 System.out.println(s1);
		 System.out.println("Second student :");
		 System.out.println(s2);
		 System.out.println("Third student :");
		 System.out.println(s3);
	}

}
