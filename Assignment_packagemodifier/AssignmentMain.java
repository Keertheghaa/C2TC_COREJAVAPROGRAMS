package com.tnsif.Assignment_packagemodifier;
import com.tnsif.Assignment_employee.Employee;
import com.tnsif.Assignment_employee.Manager;
import com.tnsif.Assignment_employee.Developer;



public class AssignmentMain  {
	public static void main(String[] args) {
		
		
		  Employee e; 

	       
	        e = new Manager("Keerthi", 100, 70000, "HR");
	        
	        if (e instanceof Manager) {
	            System.out.println("Manager Details: " + e);
	        }

	        
	        e = new Developer("Sri Kanya", 110, 60000, "Core Java");
	        
	        if (e instanceof Developer) {
	        	
	            System.out.println("Developer Details: " + e);
	        }


	}

}
