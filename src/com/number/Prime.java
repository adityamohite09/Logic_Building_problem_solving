package com.number;

import java.util.Scanner;

public class Prime {


	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		
		System.out.println("Enter the number that you want to check prime or not : ");
		int val = sobj.nextInt();
		Primenum f = new Primenum(val);
		int iRet =f.display();
	
		if(iRet > 2)
		{
			System.out.println("Not a Prime Number : "+val);

		}
		else
		{
			System.out.println("Prime Number : "+val);
					}
		
	}

}

class Primenum{
	int num;
Primenum(int num)
	{
		this.num = num;
	}
	
	public int display()
	{
	
		int count=0;
		
		for(int i=1;i<=1000;i++)
		{
			if(num % i == 0)
			{
				count++;
			}
		}
		
		return count;
		
	}
}
