package com.number;

import java.util.Scanner;

public class Armstrongnum {
public static void main(String[] args) {
	Scanner sobj = new Scanner(System.in);
	
	System.out.println("Enter the number :");
	int no = sobj.nextInt();
	
	String str = Integer.toString(no);
	int size = str.length();
	
	int copy = no;
	int idigit =0;
	int sum =0;
	
	while(no != 0)
	{
		idigit = no % 10;
		sum = sum + (int)(Math.pow(idigit, size));
		no = no / 10;	
	}

	if(sum == copy)
	{
		System.out.println("Armstrong number : "+copy);
	}
	else
	{
		System.out.println("Not Armstrong number : "+copy);
	}
}
}
