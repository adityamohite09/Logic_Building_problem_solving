package com.string;

public class SwapCase {
	public static void main(String[] args) {
		String str ="AbC";
		for(int i=0;i<str.length();i++)
		{
			char ch =str.charAt(i);
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
			{
				ch= (char)(ch +32);
			}
			else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
			{
				ch= (char)(ch -32);
			}
//			System.out.print(ch);
//			String st = new String(new char[] {ch});
			String st = Character.toString(ch);
			System.out.print(st);
		}
		
	}

}
