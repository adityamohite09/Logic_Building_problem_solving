package com.digit;

import java.util.Scanner;

public class PalindromeNum {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int no = sobj.nextInt();

		int sum=0;
		int Rev=0;
		int copy = no;
		
		while(no != 0)
		{
			int idigit = no % 10;
			
			Rev = Rev*10 + idigit;
			
			no = no / 10;
		}
		
		if(copy == Rev)
		{
			System.out.println("Palindrome Number");
		}
		else
		{
			System.out.println("Not Palindrome Number");
		}
		
	}
}
