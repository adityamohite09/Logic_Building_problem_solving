package com.number;

import java.util.Scanner;

public class StrongNumber {
		public static void main(String[] args) {
			Scanner sobj = new Scanner(System.in);
			
			System.out.println("Enter the number that you want to check :");
			int ino = sobj.nextInt();
			boolean bret = false;
			int copy=ino;
			int i=0;
			int mul=1;
			int sum=0;
			while(ino !=0)
			{
				int idigit = ino % 10;
				
				for(i=1;i<=idigit;i++)
				{
					mul=mul*i;
				}
				 sum = sum +mul;
				 mul=1;
				ino = ino / 10;
			}
			
			
			if( copy == sum)
			{
				System.out.println("Strong Number : "+copy);
			}
			else
			{
				System.out.println("Not Strong Number : "+copy);
			}
		}


}

