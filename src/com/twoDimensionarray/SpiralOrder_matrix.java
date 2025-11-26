package com.twoDimensionarray;

import java.util.Scanner;

public class SpiralOrder_matrix {
	
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
			
			for (int i = 0; i < row1; i++) {

				for (int j = 0; j < col1; j++) {
					
					if(i==0 || i+1==row1 || j==0 || j+1==col1)
					{
						System.out.print(arr1[i][j]+"  ");
					}
					else
					{

						for(int x=0;x<arr1.length/2;x++)
						{
							for(int y=0;y<arr1.length/2;y++) {
							if(x==0 || x+1==row1 || y==0 || y+1==col1)
							{
								System.out.print(arr1[x][y]+"  ");						
							}
							
						}
						
							System.out.println();
					}
				}
				}
				System.out.println();

			}
		}}
