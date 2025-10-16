package com.pattern;

import java.util.Scanner;

public class Inverted_right_triangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the row : ");
		int row = sobj.nextInt();
		
		System.out.println("Enter the col : ");
		int col = sobj.nextInt();
		
		
		int i=0;
		int j=0;
		for(i=row-1;i>=0;i--)
		{
			for(j=0;j<=i;j++)
			{
				System.out.print("*"+"\t");
			}
			System.out.println();
		}
	}

}
