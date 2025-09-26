package com.number;

import java.util.Scanner;

public class Evennumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the Number : ");
		int no1 =sobj.nextInt();
		
		if(no1%2 == 0)
		{
			System.out.println("Even Number : "+no1);
		}
		else
		{
			System.out.println("Odd Number : "+no1);
		}

	}

}
