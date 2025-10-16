package com.twoDimensionarray;

import java.util.Scanner;

public class Substractiontwonumber {

	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the row of first matrix : ");
		int row1=sobj.nextInt();
		
		System.out.println("Enter the col of first matrix : ");
		int col1=sobj.nextInt();
		
		System.out.println("Enter the row of first matrix : ");
		int row2=sobj.nextInt();
		
		System.out.println("Enter the col of first matrix : ");
		int col2=sobj.nextInt();
		
		int arr1[][]= new int[row1][col1];
		int brr1[][]=new int[row2][col2];
		int crr1[][]=new int[row1][col2];
		
		for(int i=0;i<row1;i++)
		{
			for(int j=0; j<col1; j++)
			{
				System.out.println("Enter the element first matrix : ");
				arr1[i][j]=sobj.nextInt();
			}
		}
		
		for(int i=0;i<row1;i++)
		{
			for(int j=0; j<col1; j++)
			{
				System.out.println("Enter the element second matrix : ");
				brr1[i][j]=sobj.nextInt();
			}
		}
		
		
		for(int i=0;i<row1;i++)
		{
			for(int j=0; j<col2; j++)
			{
				
					crr1[i][j] += arr1[i][j] - brr1[i][j];
				
			}
		}
		System.out.println("Display Result substraction :");
		for(int i=0;i<row1;i++)
		{
			for(int j=0; j<col2; j++)
			{
				System.out.print(crr1[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}

}
