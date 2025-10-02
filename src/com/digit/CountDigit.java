package com.digit;

import java.util.Scanner;

public class CountDigit {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int no = sobj.nextInt();

		int sum=0;
		int count=0;
		int copy = no;
		
		while(no != 0)
		{
			int idigit = no % 10;
			count++;
			no = no / 10;
		}
		
		
			System.out.println("Count of Digit : "+count);
		
	}
}
