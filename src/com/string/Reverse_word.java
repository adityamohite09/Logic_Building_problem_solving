package com.string;

public class Reverse_word {
	public static void main(String[] args) {
		String str ="aditya mohite";
		String copy = str;
		int i=0;
		String result =" ";
		String word[] = str.split(" ");
		
	
		for(i=0; i<word.length;i++)
		{
		result=word[i] +" "+result;
		}
		
		
		System.out.println("Original String : "+copy);
		System.out.println("Reverse word : "+result);
	}

}
