package com.string;

import java.util.Scanner;

public class Allsubstring {
	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the String :");
		String str = sobj.nextLine();
		
		for(int i=0; i<str.length();i++)
		{
			for(int j=i; j<str.length();j++)
			{
				System.out.print("{");
				for(int k=i;k<=j;k++) {
					char ch = str.charAt(k);
					System.out.print(ch+" ");
				}
				System.out.print("}");
			}
		}
	}
}
