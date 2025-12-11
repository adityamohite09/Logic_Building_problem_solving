package com.string;

public class First_Repeatng_character {
	public static void main(String[] args) {
		String str ="abceea";
		int count=0;
		boolean bret = false;
		
		for(int i=0;i<str.length();i++)
		{
			count=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					count++;
				}
			}
			
			if(count != 1)
			{
				System.out.println(str.charAt(i));
				bret = true;
				break;
			}
		}
	}

}
