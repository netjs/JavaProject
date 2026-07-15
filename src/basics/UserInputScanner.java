package basics;

import java.util.Scanner;

public class UserInputScanner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your full name: ");
		String fullName = sc.nextLine();
		
		System.out.println("Enter first name: ");
		String fName = sc.next();
		
		System.out.println("Enter last name: ");
		String lName = sc.next();
		
		System.out.println("Enter you age: ");
		int age = sc.nextInt();
		
		System.out.println("Enter amount: ");
		double amount = sc.nextDouble();
		
		System.out.println("Full Name: "+ fullName);
		System.out.println("First Name: " + fName);
		System.out.println("Last Name: " + lName);
		System.out.println("Age: " + age);
		System.out.println("Amount: " + amount);
		sc.close();
	

	}

}
