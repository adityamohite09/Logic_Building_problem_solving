package com.digit;

import java.util.Scanner;

public class FreqCount {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number : ");
		int no = sobj.nextInt();
		
		System.out.println("Enter the check frequancy : ");
		int no2 = sobj.nextInt();
		int count=0;
		
		while(no != 0)
		{
			int digit = no % 10;
			if(digit % no2 ==0)
			{
				count++;
			}
			no=no/10;
		}
		
		
		System.out.println("frequancy of digit : "+count);
		
		
	}

}
