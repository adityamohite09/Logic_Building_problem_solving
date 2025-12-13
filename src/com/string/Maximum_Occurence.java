package com.string;

public class Maximum_Occurence {
	public static void main(String[] args) {
		String str ="pkbkiopep";
		int count=0;
		int maxcount=0;
		char maxchar='0';
		char c='0';
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
		if(count>maxcount)
		{
			maxcount=count;
			maxchar=str.charAt(i);
			
			
		}
		}
		System.out.println(maxchar);
	
	
		
	}
}
