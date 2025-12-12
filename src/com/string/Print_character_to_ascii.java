package com.string;

public class Print_character_to_ascii {
	public static void main(String[] args) {
		String str ="AB";
		
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			int num = (int)(ch);
			 System.out.println(num);
		}
	 
	   
	}
}
