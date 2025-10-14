package com.string;

import java.util.Scanner;

public class Check_duplicate_string {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str =  sobj.nextLine();
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1; j<str.length();j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					count++;
				}
			}
		}
		
		if(count > 0)
		{
			System.out.println("contain duplicate ");
		}
		
		
		
	}

}
