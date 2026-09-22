package com.netjstech.training.oops;

/**
 * Class to show constructor overloading and 
 * use of this with overloaded constructors
 */
public class Person {
	private String firstName;
	private String lastName;
	private int age;
	
	// no-arg constructor
	public Person() {
		System.out.println("New Person object is created");
		this("", "", 0);
//		this.firstName = "Test";
//		this.lastName = "User";
//		this.age = 26;
	}
	
	public Person(String firstName, String lastName) {
		this(firstName, lastName, 0);
	}
	
	// Parameterized Constructor
	public Person(String firstName, String lastName, int age) {
		System.out.println("New Person object is created");
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}


	public void displayPersonDetails() {
		System.out.println("First Name: " + firstName + " Last Name: " + lastName + " Age: "+ age);
	}
	
}
