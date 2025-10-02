package com.digit;

import java.util.Scanner;

public class SumDigit {

	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int no = sobj.nextInt();

		int sum=0;
		
		while(no != 0)
		{
			int idigit = no % 10;
			sum = sum + idigit;
			no = no / 10;
		}
		System.out.println("Sum of Digit is : "+sum);
	}
}
