package com.netjstech.array;

import com.netjstech.training.oops.Customer;

public class ObjectArrayDemo {

	public static void main(String[] args) {
		// new
		Customer[] customers = new Customer[3];
		
		// declare and initialize
		Customer[] customers1 = {new Customer("Ram", 25), new Customer("Marie", 32), new Customer("Shyam", 34)};
		
		Customer cust = new Customer("Ram", 25);
		customers[0] = cust;

		cust = new Customer("Marie", 32);
		customers[1] = cust;
		cust = new Customer("Shyam", 34);
		customers[2] = cust;
		
		for(Customer customer: customers1) {
			customer.displayCustomerDetails();
		}
	}

}
