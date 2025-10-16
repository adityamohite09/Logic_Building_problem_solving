package com.twoDimensionarray;

import java.util.Scanner;

public class PrintDisgonalelement {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the row : ");
		int row = sobj.nextInt();
		
		System.out.println("Enter the col : ");
		int col = sobj.nextInt();
		int arr[][]=new int [row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				System.out.println("enter the element  : ");
				arr[i][j]=sobj.nextInt();
			}
			
		}
		
		System.out.println("Print all diagonal : ");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(i==j || (i+j)==4)
				{
					System.out.print(arr[i][j]);
				}
			}
			System.out.println();
		}
		
		
	}

}
