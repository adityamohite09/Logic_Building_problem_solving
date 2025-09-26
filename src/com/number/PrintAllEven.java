package com.number;

import java.util.Scanner;

public class PrintAllEven {

	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		boolean bret=false;
		
		int i=0;
		for(i=1;i<=1000;i++)
		{
		if(i%2 ==0)
		{
			bret = true;
		}
		else
		{
			bret = false;
		}
		
		if(bret == true)
		{
			System.out.print(i+" ");
		}
		
		}
		
		
		
		
		
	}
}
