package com.netjstech.array;

import java.util.Scanner;

/**
 * Creating a Jagged array by taking user input
 */
public class JaggedArrayInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// take number of rows
		System.out.println("Enter number of rows: ");
		int rows = sc.nextInt();
		
		int[][] jaggedArray = new int[rows][];
		
		for(int i = 0; i < jaggedArray.length; i++) {
			System.out.println("Enter number of columns for row " + i);
			int columns = sc.nextInt();
			jaggedArray[i] = new int[columns];
		}
		
		// taking input for each row
		for(int i = 0; i < jaggedArray.length; i++) {
			System.out.println("Enter elements for row " + i);
			for(int j = 0; j < jaggedArray[i].length; j++) {
				jaggedArray[i][j] = sc.nextInt();
			}
		}
		System.out.println("*** Array Elements ***");
		// Iterating the array
		for(int i = 0; i < jaggedArray.length; i++) {
			for(int j = 0; j < jaggedArray[i].length; j++) {
				System.out.print(jaggedArray[i][j] + " ");
			}
			System.out.println();
		}


	}

}
