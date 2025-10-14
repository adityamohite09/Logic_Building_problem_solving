package com.string;

public class SmallestWord_sentence {
public static void main(String[] args) {
	String sentence = "my name is aditya";
	
	String word[]=sentence.split(" ");
	String smallest =word[0];
	
	int i=0;
	for(i=0;i<word.length;i++)
	{
		if(word[i].length() < smallest.length())
		{
		smallest = word[i];
		}
	}
	
	System.out.println("Smallest word in sentence : "+smallest);
}
}
