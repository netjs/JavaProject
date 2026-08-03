package basics.conditions;

import java.util.Scanner;

/**
 * Take as input- operator and two numbers from user and use switch case to 
 * write a calculator program that will use the entered operator to do the calculation 
 * with the entered numbers.
 */
public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		double num1 = sc.nextDouble();
		System.out.println("Enter second number: ");
		double num2 = sc.nextDouble();
		System.out.println("Enter Operator: ");
		String op = sc.next();
		double result = doOperation(num1, num2, op);
		System.out.println("Result = " + result);
		sc.close();

	}
	
	private static double doOperation(double num1, double num2, String op) {
		double result = switch(op) {
			case "+" -> num1 + num2;
			case "-" -> num1 - num2;
			case "*" -> num1 * num2;
			case "/" -> num1/num2;
			default -> {
				System.out.println("Wrong operator ");
				yield 0.0;
			}
		};
		return result;
	}

}
