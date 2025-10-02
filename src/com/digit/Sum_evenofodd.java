package com.digit;

import java.util.Scanner;

public class Sum_evenofodd {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int no = sobj.nextInt();

		int sum=0;
		int count=0;
		int copy = no;
		int even=0,odd=0;
		
		while(no != 0)
		{
			int idigit = no % 10;
			
			if(idigit % 2 ==0)
			{
				even = even + idigit;
			}
			else
			{
				odd = odd + idigit;
			}
			
			no = no / 10;
		}
		 sum = even + odd;
		
			System.out.println("sum of Even Digit : "+even);
			System.out.println("sum of Odd Digit : "+odd);
		
	}
}
