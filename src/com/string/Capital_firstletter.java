package com.string;

import java.util.Scanner;

public class Capital_firstletter {
	public static void main(String[] args) {
	Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String str =sobj.nextLine();
		String printt="";
		
		
		for(int i=0;i<str.length();i++)
		{
			char cp=str.charAt(i);
			if(i==0)
			{
			if(cp >= 97 && cp<=122)
			{
				cp = (char) (cp - 32);
			}
			}
			printt+=cp;
		}
		System.out.println(printt);
	}
}
