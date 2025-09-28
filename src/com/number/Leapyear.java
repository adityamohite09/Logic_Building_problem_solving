package com.number;

import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the number that you want to check :");
		int ino = sobj.nextInt();
		
		
		if(ino % 4 == 0 && ino % 100 != 0  && ino % 400 == 0)
		{
			System.out.println("Leap year : "+ino);
		}
		else
		{
			System.out.println("Not Leap Year : "+ino);
		}
	}
	
}
