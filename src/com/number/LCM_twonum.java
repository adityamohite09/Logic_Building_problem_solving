package com.number;

import java.util.Scanner;

public class LCM_twonum {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter number 1 : ");
		int no1 = sobj.nextInt();
		
		System.out.println("Enter number 2 :");
		int no2 = sobj.nextInt();
		
		int GCD=0;
		int i=0;
		for( i=1; i<=10; i++)
		{
			if(no1%i == 0 && no2 % i ==0)
			{
			GCD =  i;
			}
			
		}
		
		int lcm = no1*no2/GCD;
		
		System.out.println(lcm);
		
	}
}
