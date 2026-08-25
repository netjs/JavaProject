package com.netjstech.training.oops;

public class CustomerDriver {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer("Ram", 25);
		customer1.displayCustomerDetails();
		
		Customer customer2 = new Customer("Mahesh", 32);
		customer2.displayCustomerDetails();
		
		Customer customer3;
		customer3 = new Customer("Ramesh", 45);
		customer3.displayCustomerDetails();
		
		Customer customer4 = new Customer("Mahesh", 32);
		customer4.displayCustomerDetails();

	}

}
