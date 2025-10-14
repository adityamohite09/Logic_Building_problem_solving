package com.string;

import java.util.Scanner;

public class CountWordString {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str =  sobj.nextLine();
		int count=0;
		String word []=str.split(" ");
		
		for(int i=0;i<word.length;i++)
		{
			count++;
		}
		
		System.out.println("count the count : "+count);
	}

}
