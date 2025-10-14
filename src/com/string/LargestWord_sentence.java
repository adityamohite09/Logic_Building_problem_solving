package com.string;

import java.util.Scanner;

public class LargestWord_sentence {
	public static void main(String[] args) {
		String sentence = "hello je my name";
	String word[] =	sentence.split(" ");
		String largeword= "";
		for(int i=0; i<word.length;i++)
		{
			if(word[i].length() > largeword.length())
			{
				largeword = word[i];
			}
		}
		System.out.println("largest word : "+largeword);	
	}
}
