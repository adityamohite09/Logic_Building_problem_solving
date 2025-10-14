package com.string;

import java.util.Scanner;

public class CheckPalindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String copy=str;
		String Rev ="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			Rev = Rev + str.charAt(i);
		}
		
		if(copy.equals(Rev))
		{
			System.out.println("Palingdrome String");
		}
		else
		{
			System.out.println("Not Palindrome String");
		}
		
	}
}
