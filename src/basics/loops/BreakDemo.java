package basics.loops;

import java.util.Scanner;

public class BreakDemo {

	public static void main(String[] args) {
		//printNumbers();
		int[] num = {4, 17, 48, 2, 4, 3, 78, 13};
		int n = 17;
		boolean result = search(num, n);
		if(result) {
			System.out.println("Found " + n);
		}else {
			System.out.println("Not found");
		}
		
		passwordCheck();
		
		//nestedWithBreak();
		
		nestedWithLabelledBreak();

	}
	
	//Print numbers from 1 to 50, but stop completely when you 
	//reach the second multiple of 7.
	public static void printNumbers() {
		int count = 0;
		for(int i = 1; i <= 50; i++) {
			System.out.println(i);
			if(i % 7 == 0) {
				count++;
				// for second multiple come out of the loop
				if(count == 2) {
					break;
				}
			}
		}
		System.out.println("Out of loop " + count);
	}
	
	// Linear Search 
	public static boolean search(int[] num, int n) {
		boolean flag = false;
		for(int number : num) {
			if(number == n) {
				flag = true;
				break;
			}
		}
		return flag;
	}
	
	// Keep asking the user for a password until they enter the correct one. Use break to exit once the 
	// correct password is entered. Change the code to include continue also. 
	public static void passwordCheck() {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Enter Password: ");
			String pwd = sc.next();
			if(!pwd.equals("Secret")) {
				System.out.println("Wrong Passwrod");
				continue;
			}else {
				System.out.println("Welcome!");
				break;
			}
		}
		sc.close();
	}
	
	// Nested loop with break
	public static void nestedWithBreak() {
		for(int i = 0; i <=4; i++) {
			
			for(int j = 1; j <= 10; j++) {
				System.out.print(j + " ");
				if(j == 5)
					break;
			}
			break;
			//System.out.println();
		}
	}
	
	// Nested loop with labelled break
	public static void nestedWithLabelledBreak() {
		outerLoop:
		for(int i = 0; i <=4; i++) {
			
			for(int j = 1; j <= 10; j++) {
				System.out.print(j + " ");
				if(j == 5)
					break outerLoop;
			}
			
			System.out.println();
		}
	}
}
