package com.digit;

import java.util.Scanner;

public class Alternatedigit {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int no = sobj.nextInt();
		int sum=0;
		int copy= no;
		int ecount=0;
		int ocount=0;

		while(no != 0)
		{
			int digit = no % 10;
				if( digit % 2 ==0)
				{
					System.out.println("e");
					ecount++;
				}
				else
				{
					System.out.println("o");
					ocount++;
				}
			no=no/10;
		}
	
		
		if(ecount == ocount)
		{
			System.out.println("alternate digit");
		}
		else
		{
			System.out.println("Not Alternate digit");
		}
		
	}
}
