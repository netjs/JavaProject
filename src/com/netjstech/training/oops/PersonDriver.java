package com.netjstech.training.oops;

public class PersonDriver {

	public static void main(String[] args) {
		Person person1 = new Person("Test", "User", 26);
		
		Person person2 = new Person("Ramesh", "Sharma", 34);

		person1.displayPersonDetails();
		person2.displayPersonDetails();
		
		person1 = null;

	}

}
