package com.netjstech.array;

/**
 * Creating a jagged array using new keyword
 */
public class JaggedArrayNew {

	public static void main(String[] args) {
		int[][] jaggedArray = new int[3][];
		
		// initializing each row
		jaggedArray[0] = new int[] {5, 6, 7};
		jaggedArray[1] = new int[] {1, 2};
		jaggedArray[2] = new int[] {1, 2, 3, 4};
		
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
