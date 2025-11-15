package com.tnsif.day5.inheritanceexample;

public class Executors {
	

		public static void main(String[] args) {
			Person p= new Person("Keerthi",20,"VPM");
			System.out.println(p);
			
			Students s = new Students("Lily",20,"Puducherry",101,"java");
	        System.out.println(s);
	        
	        Teacher t = new Teacher("Sudha",21,"Villupuram",102,"HOD","Am");
	        System.out.println(t);

		}

	}

