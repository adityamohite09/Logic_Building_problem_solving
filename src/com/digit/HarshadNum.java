package com.digit;

import java.util.Scanner;

public class HarshadNum {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int no = sobj.nextInt();
		int sum=0;
		int copy= no;

		while(no != 0)
		{
			int digit = no % 10;
				sum = sum + digit;
			no=no/10;
		}
	
		if(copy%sum ==0)
		{
			System.out.println("Harshad Number : "+copy);
		}
		else
		{
			System.out.println("Not Harshad Number : "+copy);
		}
		
		
	}

}
