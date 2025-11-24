package com.twoDimensionarray;

import java.util.Scanner;

public class Sum_of_diagonals {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		int sum=0;
		System.out.println("Enter the row :");
		int row = sobj.nextInt();
		
		System.out.println("Enter the col :");
		int col = sobj.nextInt();
		
		int arr[][]=new int[row][col];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=sobj.nextInt();
			}
		}
		System.out.println("display matrix");
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			if(j== col-i-1)
			{
				sum+=arr[i][j];
			}
			}
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
			if(i== j)
			{
				sum+=arr[i][j];
			}
			}
		}
		System.out.println("sum of left and right digonal "+sum);
	}
}
