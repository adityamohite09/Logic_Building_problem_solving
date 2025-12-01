package com.string;

import java.util.Scanner;

public class RemoveDuplicateString {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);		
		System.out.println("Enter the String : ");
		String str = sobj.nextLine();				
		String result="";
		for(int i=0;i<str.length();i++)
		{
			String ch =""+ str.charAt(i);
			if(result.contains(ch))
			{
				continue;
			}		
			result += ch;
		}		
		System.out.println("Remove Duplicate element: "+result);	
	}
}
