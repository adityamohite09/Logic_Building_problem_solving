package com.twoDimensionarray;

import java.util.Scanner;

public class Row_max_sum {
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

		int sum=0;
		int y=0;
		for (int i = 0; i < row1; i++) {
		
			sum=0;
			for (int j = 0; j < col1; j++) {
				sum=sum+ arr1[i][j];
				y=sum;
				if(sum>y)
				{
					y=0;
					y=sum;
				}
			
				
			
			}
			
		}
		System.out.println("Maximum sum row array : " + y);
	}

}
