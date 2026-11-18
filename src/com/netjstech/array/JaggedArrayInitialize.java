package com.netjstech.array;

/**
 * Declaring and initializing jagged array
 */
public class JaggedArrayInitialize {

	public static void main(String[] args) {
		// Declare and initialize
		String[][] jaggedArray = {
				{"New Delhi", "Bangalore"},
				{"NYC", "Chicago", "LA"},
				{"London"}
		};
		
		// getting column lengths
		for(int i = 0; i < jaggedArray.length; i++) {
			System.out.println("Row " + i + " has " + jaggedArray[i].length + " columns");
		}
		
		System.out.println("*** Array Elements ***");
		// iterating jagged array
		for(int i = 0; i < jaggedArray.length; i++) {
			for(int j = 0; j < jaggedArray[i].length; j++) {
				System.out.print(jaggedArray[i][j] + " ");
			}
			System.out.println();
		}

	}

}
