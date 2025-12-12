package com.string;

public class Maximum_Occurence {
	public static void main(String[] args) {
		String str ="uaaabbc";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i) == str.charAt(j))
				{
					count++;
				}
			}
			
			if(count==0)
			{
				System.out.println(str.charAt(i));
				
			}
		}
	}
}
