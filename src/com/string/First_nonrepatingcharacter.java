package com.string;

public class First_nonrepatingcharacter {
	public static void main(String[] args) {
		String str ="aabbhooff";
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
			
			if(count == 1)
			{
				System.out.println(str.charAt(i)+" first non repating charater ");
				bret = true;
				break;
			}
		}
		
		if(!bret)
		{
			System.out.println("not found first non repating character ");
		}
	}

}
