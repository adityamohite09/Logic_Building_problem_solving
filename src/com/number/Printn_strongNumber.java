package com.number;

//import java.util.Scanner;

public class Printn_strongNumber {
		public static void main(String[] args) {
//			Scanner sobj = new Scanner(System.in);
			
//			System.out.println("Enter the number that you want to check :");
//			int ino = sobj.nextInt();
//			boolean bret = false;
//			int copy=ino;
			int i=0;
			int mul=1;
			int sum=0;
			int temp=0;
			for(i=1;i<=1000;i++)
			{
				temp=i;  
			    sum=0;
			while(temp !=0)
			{
				mul=1;
				int idigit = temp % 10;
				
				for(int j=1;j<=idigit;j++)
				{
					mul=mul*j;
				}
				 sum = sum +mul;
				
				
			    temp = temp / 10;
			  
			}
			
			
			if( i == sum)
			{
				System.out.println("Strong Number : "+i);
			}
			}
			
	
			
		}


}

