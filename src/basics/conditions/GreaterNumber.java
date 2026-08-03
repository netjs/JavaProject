package basics.conditions;

import java.util.Scanner;

/**
 * takes 2 numbers as input and find out the maximum of two numbers.
 */
public class GreaterNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = sc.nextInt();
		System.out.println("Enter second number: ");
		int num2 = sc.nextInt();
		int max = findGreaterNumber(num1, num2);
		System.out.println("Max of " + num1 + " and " + num2 + " is " + max);
		sc.close();

	}
	
	private static int findGreaterNumber(int num1, int num2) {
		if(num1 >= num2) {
			return num1;
		}
		return num2;
	}

}
