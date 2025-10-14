package com.string;

import java.util.Scanner;

public class RemoveSpace {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str =  sobj.nextLine();
		int count=0;
		int j=0;
		
		for(int i=0;i<str.length();i++)
		{
//			for(int j=i+1;j<str.length();j++)
//			{
				char ch1 = str.charAt(i);
				char ch2 = str.charAt(j);
				
				if(ch1 == ch2)
				{
					j++;
					str[j]=ch1;
					
//				}
			}
		}
	}

}
