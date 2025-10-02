package com.digit;

import java.util.Scanner;

public class Smallest {
		public static void main(String[] args) {
			Scanner sobj = new Scanner(System.in);
			System.out.println("Enter the number : ");
			int no = sobj.nextInt();
			int smallest=0;
			int largest =0;

			while(no != 0)
			{
				int digit = no % 10;
					if(digit > largest)
					{
						largest = digit;
					}
					else
					{
						smallest = digit;
					}
				no=no/10;
			}
			System.out.println("smallest of digit : "+smallest);
		}

}
