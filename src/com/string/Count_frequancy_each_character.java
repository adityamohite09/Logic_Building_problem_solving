package com.string;

public class Count_frequancy_each_character {
	public static void main(String[] args) {
		String str="aabbc";
		boolean bret = false;
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			char ch1=str.charAt(i);
			bret = false;
			for(int j=0;j<i;j++)
			{
				
				char ch2=str.charAt(j);
				if(ch1 == ch2)
				{
					bret = true;
					
					break;
				}
			}
			if(bret)
			{
				continue;
			}
			count=0;
			for(int k=0;k<str.length();k++)
			{
				if(str.charAt(i) == str.charAt(k))
				{
					count++;
				}
			}
			
			System.out.println(ch1 +" count : "+count);
		}
	}

}
