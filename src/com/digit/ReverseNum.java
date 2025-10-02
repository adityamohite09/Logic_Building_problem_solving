package com.digit;

import java.util.Scanner;

public class ReverseNum {
	
	
	
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int no = sobj.nextInt();

		System.out.println("Reverse Number : ");
		
		
		while(no != 0)
		{
			int idigit = no % 10;
			System.out.print(idigit);

			no = no / 10;
		}
	}
	

}
