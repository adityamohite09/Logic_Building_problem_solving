package com.twoDimensionarray;

import java.util.Scanner;

public class print2Darray {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the row size : ");
		int iRow = sobj.nextInt();
		
		System.out.println("Enter the column size : ");
		int icol = sobj.nextInt();
		
		
		int arr[][] =new int[iRow][icol];
		
		for(int i=0;i<iRow;i++)
		{
			for(int j=0; j<icol;j++)
			{
				System.out.println("Enter the element : "+(i+1)+" "+(j+1));
				arr[i][j]= sobj.nextInt();
				
			}
		}
		System.out.println("Display array : ");
		for(int i=0;i<iRow;i++)
		{
			for(int j=0; j<icol;j++)
			{
				System.out.print(arr[i][j]+"\t");
				
			}
			System.out.println();
		}
		
		
		
	}

}
