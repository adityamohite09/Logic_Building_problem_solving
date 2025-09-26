package com.number;

import java.util.Scanner;

public class Factorialnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Factoiral Number : ");
		int value = sobj.nextInt();
		
		FactorialLogic fact = new FactorialLogic(value);
		int Ret = fact.Display();
		System.out.println("Factorial of number is : "+Ret);

	}

}

 class FactorialLogic{
	int num;
	
	FactorialLogic(int no)
	{
		this.num =no;
	}
	
	public int Display()
	{
		int mul=1;
		for(int i=1;i<=num;i++)
		{
				mul = mul * i;
			
		}
		return mul;
	}
	
}
