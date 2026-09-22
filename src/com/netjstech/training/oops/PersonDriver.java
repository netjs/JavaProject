package com.netjstech.training.oops;

public class PersonDriver {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		Person person2 = new Person("Test", "User", 26);
		
		Person person3 = new Person("Ramesh", "Sharma");

		person1.displayPersonDetails();
		person2.displayPersonDetails();
		person3.displayPersonDetails();

	}

}
