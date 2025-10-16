package com.pattern;

import java.util.Scanner;

public class Pyramid_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the row : ");
		int row = sobj.nextInt();
		
		System.out.println("Enter the col : ");
		int col = sobj.nextInt();
		
		
		int i=0;
		int j=0;
		for(i=0;i<row;i++)
		{
			for(j=col-i;j>=0;j--)
			{
				System.out.print(" ");
			}
			
			for(int k=0;k<2*i-1;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
