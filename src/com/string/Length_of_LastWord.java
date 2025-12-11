package com.string;

import java.util.Scanner;

public class Length_of_LastWord {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		String str ="hello everyone";
		int count=0;
		char arr[]=new char[str.length()];
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			count++;
			if(ch == ' ')
			{
				count=0;
			}
			System.out.print(ch);
		}
		System.out.println();
		System.out.println("length of last word : "+count);
	}

}
