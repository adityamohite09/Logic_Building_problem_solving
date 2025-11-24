package com.twoDimensionarray;

import java.util.Scanner;

public class Largest_element_matrix {
	
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
			
		int max=0;
		int min=arr1[0][0];

			for (int i = 0; i < row1; i++) {

				for (int j = 0; j < col1; j++) {
					if(arr1[i][j]>max)
					{
						max=arr1[i][j];
					}
					if(arr1[i][j]<min)
					{
						min=arr1[i][j];
					}
				}

			}
			System.out.println("Maximum array element : "+max);
			System.out.println("Minimum array element : "+min);

			
	}
}
