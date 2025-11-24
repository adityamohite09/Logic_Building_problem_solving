package com.twoDimensionarray;

import java.util.Scanner;

public class Matrix_multiplication {
	
		public static void main(String[] args) {
			Scanner sobj = new Scanner(System.in);
			int sum=0;
			System.out.println("Enter the row :");
			int row = sobj.nextInt();
			
			System.out.println("Enter the col :");
			int col = sobj.nextInt();
			
			int arr[][]=new int[row][col];
			
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					arr[i][j]=sobj.nextInt();
				}
			}
			
			System.out.println("Enter the row 2 :");
			int row2 = sobj.nextInt();
			
			System.out.println("Enter the col 2:");
			int col2 = sobj.nextInt();
			
			int arr2[][]=new int[row2][col2];
			
			for(int i=0;i<row2;i++)
			{
				for(int j=0;j<col2;j++)
				{
					arr2[i][j]=sobj.nextInt();
				}
			}
			System.out.println("display matrix 1");
			for(int i=0;i<row;i++)
			{
				System.out.print("{");
				for(int j=0;j<col;j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println("}");
			}
			System.out.println("display matrix 2");
			for(int i=0;i<row2;i++)
			{
				System.out.print("{");
				for(int j=0;j<col2;j++)
				{
					System.out.print(arr2[i][j]+" ");
				}
				System.out.println("}");
			}
			int mul=0;
			int arr3[][] = new int[row][col2];
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col2;j++)
				{
					arr3[i][j]=0;
					for(int k=0;k<col;k++)
					{
				arr3[i][j]+= + arr[i][k] * arr2[k][j];
					}
				}
			}
			
			for(int i=0;i<row;i++)
			{
				System.out.print("{");
				for(int j=0;j<col2;j++)
				{
					System.out.print(arr3[i][j]+" ");
				}
				System.out.println("}");
			}
			
			
		
		}
	}



