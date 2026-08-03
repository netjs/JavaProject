package basics.conditions;

import java.util.Scanner;

/*
 * Take a number as input from user and find out whether the number is positive or not.
 */
public class PositiveNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number:");
		int num = sc.nextInt();
		positiveOrNot(num);

	}
	
	private static void positiveOrNot(int num) {
		if(num > 0) {
			System.out.println("Number is positive");
		}else if(num < 0) {
			System.out.println("Number is negative");
		}else {
			System.out.println("Number is zero");
		}
	}

}
