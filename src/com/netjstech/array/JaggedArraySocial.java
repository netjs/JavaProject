package com.netjstech.array;

/**
 * Jagged array adjacency list example
 */
public class JaggedArraySocial {

	public static void main(String[] args) {
		int[][] jaggedArray = new int[4][];
		
		// Dynamically initialize each row
		jaggedArray[0] = new int[3];
		jaggedArray[1] = new int[1];
		jaggedArray[2] = new int[2];
		jaggedArray[3] = new int[2];
		
		jaggedArray[0][0] = 1;
		jaggedArray[0][1] = 2;
		jaggedArray[0][2] = 3;
		
		jaggedArray[1][0] = 0;

		
		jaggedArray[2][0] = 0;
		jaggedArray[2][1] = 3;
		
		jaggedArray[3][0] = 0;
		jaggedArray[3][1] = 2;

		for(int vertex = 0; vertex < jaggedArray.length; vertex++) {
			System.out.print("Person " + vertex + " is friends with: ");
			for(int neighbour = 0; neighbour < jaggedArray[vertex].length; neighbour++) {
				System.out.print(jaggedArray[vertex][neighbour] + " ");
			}
			System.out.println();
		}
		

	}

}
