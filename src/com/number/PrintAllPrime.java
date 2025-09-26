package com.number;

import java.util.Scanner;

public class PrintAllPrime {
	
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		boolean bret=false;
		
		
		int i=0;
		
		int no=0;
		
		for(no=2;no<=100;no++)
		{
			bret=true;
		for(i=2;i<no;i++)
		{
			
			if(no%i == 0)
			{
				bret=false;
				break;
			
			}
			
		}
		if(bret == true)
		{
			System.out.println(no);
		}
	
		}
		
		
		
	}
}