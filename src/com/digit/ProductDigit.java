package com.digit;

import java.util.Scanner;

public class ProductDigit {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int no = sobj.nextInt();
		int sum=0;
		int copy= no;
		int product = 1;
		while(no != 0)
		{
			int digit = no % 10;
			product = product * digit;
			no=no/10;
		}
			System.out.println("Product of digits : "+product);		
	}

}
