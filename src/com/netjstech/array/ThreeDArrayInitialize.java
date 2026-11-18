package com.netjstech.array;

/**
 * Declaring and initializing 3D array
 */
public class ThreeDArrayInitialize {
	public static void main(String[] args) {
		int[][][] numbers = {
				{ // layer 0
					{1, 2, 3},
					{4, 5, 6}
				},
				{ // layer 1
					{7, 8, 9},
					{10, 11, 12}
				}

		};
		
		//iterate using for-each
		for(int[][] depth: numbers) { // depth
			for(int[] rows: depth) { // rows
				for(int element: rows) {
					System.out.print(element + " ");
				}
				System.out.println();
			}
			System.out.println("** Next Layer **");
		}
		
	}
}
