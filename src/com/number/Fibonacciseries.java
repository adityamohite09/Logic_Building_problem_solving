package com.number;

import java.util.Scanner;

public class Fibonacciseries {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		
		System.out.println("Enter the number : ");
		int val = sobj.nextInt();
		Fibonacci f = new Fibonacci(val);
		f.display();
		
	}

}

class Fibonacci{
	int num;
	Fibonacci(int num)
	{
		this.num = num;
	}
	
	public void display()
	{
		int fib=0;
		int num1=0;
		int num2=1;
		System.out.println(num1);
		System.out.println(num2);
		
		for(int i=3;i<=num;i++)
		{
			int sum = num1+num2;
			num1=num2;
			num2=sum;
			
			System.out.println(sum);
		}
		
	}
	
}