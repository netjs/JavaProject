package basics;

import java.util.Scanner;

public class ScannerLineIssue {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a word: ");
		String word = sc.next();
		
		sc.nextLine();
		System.out.println("Enter full name: ");
		String fullName = sc.nextLine();
		
		System.out.println("Enter age: ");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter address: ");
		String address = sc.nextLine();
		
		System.out.println("Word: " + word);
		System.out.println("Full Name: " + fullName);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
		
		sc.close();

	}

}
