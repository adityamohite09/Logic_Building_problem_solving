package com.twoDimensionarray;

import java.util.Scanner;

public class Matrix_rotate_180 {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the row of matrix : ");
		int row1 = sobj.nextInt();

		System.out.println("Enter the col of matrix : ");
		int col1 = sobj.nextInt();

		int arr1[][] = new int[row1][col1];

		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				System.out.println("Enter the element matrix : ");
				arr1[i][j] = sobj.nextInt();
			}
		}
		System.out.println("Origial matrix : ");
		for (int i = 0; i < row1; i++) {
			for (int j = 0; j < col1; j++) {
				System.out.print(arr1[i][j]+"  ");
			
			}
			System.out.println();
		}
		
		System.out.println("reverse col matrix : ");
		for (int i =row1-1; i>=0; i--) {
			for (int j = col1-1; j >=0; j--) {
				System.out.print(arr1[i][j]+"  ");
			
			}
			System.out.println();
		}
		
		System.out.println("reverse  row matrix : ");
		for (int i = row1-1; i>=0;i--) {
			for (int j =col1-1;j>=0; j--) {
				System.out.print(arr1[i][j]+"  ");
			
			}
			System.out.println();
		}

		
		
	}
	
}
