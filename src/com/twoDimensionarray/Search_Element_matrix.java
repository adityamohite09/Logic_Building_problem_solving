package com.twoDimensionarray;

import java.util.Scanner;

public class Search_Element_matrix {
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
		System.out.println("Enter the col of matrix : ");
		int ele = sobj.nextInt();
		boolean bret = false;

		for (int i = 0; i < row1; i++) {

			for (int j = 0; j < col1; j++) {

				if (arr1[i][j] == ele) {
					bret = true;
					System.out.println("index  row:["+(i+1)+"]col["+(j+1)+"]");
					break;
				}

			}

		}

		if (bret) {
			System.out.println("contain");
		} else {
			System.out.println("Not Contain");
		}
	}
}
