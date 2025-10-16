package com.twoDimensionarray;

import java.util.Scanner;

public class MaximumNum2darray {

	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the row size : ");
		int iRow = sobj.nextInt();
		
		System.out.println("Enter the column size : ");
		int icol = sobj.nextInt();
		
		int max=0;
		int arr[][] =new int[iRow][icol];
		
		for(int i=0;i<iRow;i++)
		{
			for(int j=0; j<icol;j++)
			{
				System.out.println("Enter the element : Row"+(i+1)+"col "+(j+1));
				arr[i][j]= sobj.nextInt();
				
			}
		}
	
		for(int i=0;i<iRow;i++)
		{
			for(int j=0; j<icol;j++)
			{
				if(arr[i][j] > max)
				{
					max = arr[i][j];
				}
				
				
			}
			System.out.println();
		}
		
		System.out.println("Maximum number in 2D array is : "+max);
		
	}

}

