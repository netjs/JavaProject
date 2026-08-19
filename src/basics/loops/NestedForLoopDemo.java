package basics.loops;

import java.util.Scanner;

public class NestedForLoopDemo {

	public static void main(String[] args) {
		printNumberLines();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows in the matrix");
		int row = sc.nextInt();
		System.out.println("Enter number of columns in the matrix");
		int col = sc.nextInt();
		createMatrix(row, col);
		sc.close();
	}
	
	// Print 1..10 5 times
	public static void printNumberLines() {
		//Outer loop
		for(int i = 0; i < 5; i++) {			
			for(int j = 1; j <= 10; j++) {// inner loop
				System.out.print(j + " ");
			}
			System.out.println("Inner loop ended");
		}
		System.out.println("Out of loop ");
	}
	
	public static void createMatrix(int row, int col) {
		int[][] matrix = new int[row][col];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.println("Enter the element");
				int e = sc.nextInt();
				matrix[i][j] = e;
			}
		}
		
		System.out.println("-- Matrix--");
		for(int i = 0; i < row; i++) {
			for(int j = 0; j < col; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}
	}

}
