package com.string;

public class Remove_Special_character {
	public static void main(String[] args) {
		String str ="he9@ll#o!";
		
		char arr[]=str.toCharArray();
		String k="";
		for(int i=0;i<arr.length;i++)
		{
			char ch=str.charAt(i);
			if(ch >= 32 && ch<=64)
			{
				continue;
			}
			else
			{
				k=k+ch;
			}
			
		
		}
		System.out.println(k);
	}

}
