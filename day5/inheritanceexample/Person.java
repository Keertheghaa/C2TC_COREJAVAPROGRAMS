package com.tnsif.day5.inheritanceexample;

public class Person {
	 private String Name;
	 private int Age;
	 private String City;
	 
	 public Person(String name,int age,String city) {
		 Name=name;
		 Age=age;
		 City=city;
	 }
	 
	 public String getName() {
		return Name;
	 }
	 public void setName(String name) {
		Name = name;
	 }
	 public int getAge() {
		return Age;
	 }
	 public void setAge(int age) {
		Age = age;
	 }
	 public String getCity() {
		return City;
	 }
	 public void setCity(String city) {
		City = city;
	 }
	 @Override
	 public String toString() {
		return "Person [Name=" + Name + ", Age=" + Age + ", City=" + City + "]";
	 }
	 
	 
	 
	}