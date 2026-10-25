package com.netjstech.array;

import java.util.Scanner;

public class TwoDArrayDemo {

	public static void main(String[] args) {
		int row = 3;
		int column = 3;
		int[][] matrix = new int[row][column];
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter element for matrix (" + row + " X " + column + ")");
		
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				int num = sc.nextInt();
				matrix[i][j] = num;
			}
		}
		
		// Displaying the array
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < column; j++) {
				System.out.print(matrix[i][j] + " ");

			}
			System.out.println("");
		}
		System.out.println(matrix[1][2]);
		sc.close();
	}

}
