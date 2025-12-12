package com.string;

public class Length_Longest_substring_without_repeating_character {
	
	public static void main(String[] args) {
		String str ="abcabcbb";
		int count=1;
		boolean bret = false;
		char arr[]=str.toCharArray();
		for(int i=0;i<str.length();i++)
		{
			for(int j=i;j<str.length();j++)
			{
				System.out.print("{");
				for(int k=i;k<=j;k++)
				{
					if(arr[j] == arr[k])
					{
					bret = true;
					count++;
					break;
					}
					
					if(count==1)
					{
						System.out.print(arr[k]);
					}
				}
				System.out.println("}");
			}
			
		}
	}

}
