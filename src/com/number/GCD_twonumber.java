package com.number;

import java.util.Scanner;

public class GCD_twonumber {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number 1 : ");
		int no1 = sobj.nextInt();
		
		System.out.println("Enter number 2 :");
		int no2 = sobj.nextInt();
		
		int i=0;
		int gcd =0;
		for(i=1; i<=no1 && i<=no2;i++)
		{
			if((no1 % i ==0) &&(no2 % i == 0))
			{
				gcd = i;
			}
		}
		
		System.out.println("GCD of Two Number : "+gcd);
	}

}
