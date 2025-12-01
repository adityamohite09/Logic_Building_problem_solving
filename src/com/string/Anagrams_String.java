package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams_String {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sobj.nextLine();
		
		System.out.println("Enter the String 2");
		String str2 = sobj.nextLine();
		int count=0;
		
		
		char arr1[]=str.toCharArray();
		char arr2[]=str2.toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2) && (arr1.length == arr2.length))
			
		{
			System.out.println("Anagrams");
		}
		else
		{
			System.out.println("Not Anagrams");
		}
	}
}
