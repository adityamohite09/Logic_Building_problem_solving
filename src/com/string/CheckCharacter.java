package com.string;

import java.util.Scanner;

public class CheckCharacter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str = sc.nextLine();
		
		System.out.println("Enter the character that you want to check : ");
		char chk = sc.next().charAt(0);
		
		boolean bret =false;
		for(int i=0; i<str.length();i++)
		{
			if(str.charAt(i) == chk)
			{
				bret = true;
				break;
			}
		}	
		if(bret == true)
		{
			System.out.println("Contain char");
		}
		else
		{
			System.err.println("Not contain char");
		}
	}
}
