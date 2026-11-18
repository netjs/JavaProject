package com.netjstech.array;

import java.util.Scanner;

/**
 * 3D array example by taking user input for class, student, subject marks
 */
public class ThreeDArrayMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of classes: ");
		int classes = sc.nextInt();
		
		System.out.println("Enter number of students: ");
		int students = sc.nextInt();
		
		System.out.println("Enter number of subjects: ");
		int subjects = sc.nextInt();
		
		int[][][] marks = new int[classes][students][subjects];
		
		// Enter marks for students
		for(int i = 0; i < marks.length; i++) {
			for(int j = 0; j < marks[i].length; j++) {
				System.out.println("Enter marks for student " + (j + 1) + " in class " + (i+1));
				for(int k = 0; k < marks[i][j].length; k++) {
					marks[i][j][k] = sc.nextInt();
				}
			}
		}
		
		// iterating
		for(int i = 0; i < marks.length; i++) {
			for(int j = 0; j < marks[i].length; j++) {
				System.out.print("Marks for student " + (j + 1) + " in class " + (i+1) + ": ");
				for(int k = 0; k < marks[i][j].length; k++) {
					System.out.print(marks[i][j][k] + " ");
				}
				System.out.println();
			}
			System.out.println("--------");
		}
		

	}

}
