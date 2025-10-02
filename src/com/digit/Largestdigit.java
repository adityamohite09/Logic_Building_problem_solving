package com.digit;

import java.util.Scanner;

public class Largestdigit {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int no = sobj.nextInt();
		int largest=0;

		while(no != 0)
		{
			int digit = no % 10;
				if(digit > largest)
				{
					largest = digit;
				}
			no=no/10;
		}
		System.out.println("Largest of digit : "+largest);
	}
}
