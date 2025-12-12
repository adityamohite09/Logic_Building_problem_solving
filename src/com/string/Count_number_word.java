package com.string;

public class Count_number_word {
	public static void main(String[] args) {
		String str="Hello world Java";
		int count=0;
		String word[]=str.split(" ");
		
		for(int i=0;i<word.length;i++)
		{
			count++;
		}
		System.out.println(count);
		
		
	}

}
