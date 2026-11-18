package com.netjstech.array;

/**
 * 3D array creation using new keyword
 */
public class ThreeDArrayNew {

	public static void main(String[] args) {
		
		int[][][] numbers = new int[3][3][4];
		
		numbers[0][0][0] = 5;
		numbers[1][1][1] = 10;
		numbers[2][2][2] = 15;
		
		// for layers
		for(int i = 0; i < numbers.length; i++) {
			for(int j = 0; j < numbers[i].length; j++) {// rows
				for(int k = 0; k < numbers[i][j].length; k++) { // columns
					System.out.print(numbers[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println("End of layer " + i);
		}

	}

}
