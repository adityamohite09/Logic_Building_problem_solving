package com.string;

public class Toggle_char_even_odd {
	
	
	public static void main(String[] args) {
		String str ="abcdefg";
		String t="";
		for(int i=0;i<str.length();i++)
		{
			char ch= str.charAt(i);
			if(i%2==0)
			{
				ch = (char)(ch-32);
			}
			
			
			System.out.println(ch);
		}
	}

}
