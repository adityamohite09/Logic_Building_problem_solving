package com.string;

public class String_Contain_only_digit {

	public static void main(String[] args) {
		String str ="12345";
		boolean bret =false;
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) >=48 && str.charAt(i)<= 57)
			{
				count++;
				bret = true;
			}
			else
			{
				bret =false;
				break;
			}
		}
		System.out.println(count);
		if(bret)
		{
			System.out.println("Contain only digit");
		}
		else
		{
			System.out.println("Not only digit");
		}
	}
}
