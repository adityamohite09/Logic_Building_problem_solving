package com.string;

import java.util.Scanner;

public class ConvertTOUppercase {
	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the String :");
		String str = sobj.nextLine();
		
//		for(int i=0;i<str.length();i++)
//		{
//			char ch = str.charAt(i);
//			if(ch >= 65 && ch<=90)
//					{
//				ch =(char)( ch + 32);
//					}
//			else if( ch >= 97 && ch <=122)
//			{
//				ch = (char)(ch -32);
//			}
//			
//			System.out.println(ch);
//		}
		
		
		
		String lo=str.toLowerCase();
		System.out.println("Lowercase :"+lo);
		
		String up = str.toUpperCase();
		System.out.println("Uppercase : "+up);
		
		
	
	}
}
