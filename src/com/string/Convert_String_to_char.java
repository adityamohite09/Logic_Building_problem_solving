package com.string;

import java.util.Scanner;

public class Convert_String_to_char {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String str =sobj.nextLine();
		
		char []arr=new char[str.length()];
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i] += str.charAt(i);
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
	}
}
