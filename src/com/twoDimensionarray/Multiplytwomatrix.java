package com.twoDimensionarray;

import java.util.Scanner;

public class Multiplytwomatrix {

	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the row first matrix : ");
		int iRow = sobj.nextInt();
		
		System.out.println("Enter the column first matrix : ");
		int icol = sobj.nextInt();
		
		
		System.out.println("Enter the row second matrix : ");
		int iRow2 = sobj.nextInt();
		
		System.out.println("Enter the column second matrix : ");
		int icol2 = sobj.nextInt();
		
		int max=0;
		int arr1[][] =new int[iRow][icol];
		int arr2[][] =new int[iRow2][icol2];
		int arr3[][] =new int[iRow][icol2];
		
		for(int i=0;i<iRow;i++)
		{
			for(int j=0; j<icol;j++)
			{
				System.out.println("Enter the element : Row"+(i+1)+"col "+(j+1));
				arr1[i][j]= sobj.nextInt();
				
			}
		}
		
		for(int i=0;i<iRow2;i++)
		{
			for(int j=0; j<icol2;j++)
			{
				System.out.println("Enter the element : Row"+(i+1)+"col "+(j+1));
				arr2[i][j]= sobj.nextInt();
				
			}
		}
		
	
		for(int i=0;i<iRow;i++)
		{
			for(int j=0; j<icol2;j++)
			{
				arr3[i][j]=0;
				 for (int k = 0; k < icol; k++) {
				arr3[i][j] += arr1[i][k]*arr2[k][j];
				 }
				
			}
		
		}
		for(int i=0;i<iRow;i++)
		{
			for(int j=0; j<icol2;j++)
			{
				System.out.print(arr3[i][j]+" ");
				
				
			}
			System.out.println();
		}

		
		
		
//		System.out.println("Maximum number in 2D array is : "+max);
		
	}

}

