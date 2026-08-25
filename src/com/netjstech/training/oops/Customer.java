package com.netjstech.training.oops;

public class Customer {
	// instance variables
	private String name;
	private int age;
	
	// Constructor
	Customer(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public void displayCustomerDetails() {
		System.out.println("Name: " + name + " Age: " + age);
	}
}
