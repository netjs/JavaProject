package com.netjstech.array;

public class ArrayDemo {

	public static void main(String[] args) {
		// Using new operator
		int[] numArr = new int[10];
		
		numArr[3] = 19;
		numArr[7] = 34;
		
		System.out.println("Length of numArr " + numArr.length);
		
		// using traditional for-loop
		for(int i = 0; i < numArr.length; i++) {
			System.out.println(numArr[i]);
		}
		
		double[] numbers = {5.67, 7, 8.9, 9.99, 7.6};
		
		//for-each loop
		for(double d: numbers) {
			System.out.println(d);
		}
		// assigning new value
		numbers[2] = 4.56;
		
		//for-each loop
		for(double d: numbers) {
			System.out.println(d);
		}
	
		
	}

}
