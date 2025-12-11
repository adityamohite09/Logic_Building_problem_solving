package com.string;

import java.util.Scanner;

public class Palindrome_string {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		String str1="madam";
		String copy=str1;
		
		String rev="";
		
		for(int i=str1.length()-1;i>=0;i--)
		{
			char ch= str1.charAt(i);
			rev = rev + ch;
		}
		if(copy.equals(rev))
		{
			System.out.println("Palindrom number");
		}
		else
		{
			System.out.println("Not Palindrome number");
		}
		
	}

}
