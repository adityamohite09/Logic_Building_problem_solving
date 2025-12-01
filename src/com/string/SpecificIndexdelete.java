package com.string;

import java.util.Scanner;

public class SpecificIndexdelete {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String str = sobj.nextLine();
		int index=2;
		
//		str = str.substring(0,index) + str.substring(index+1);
//		System.out.println("Remove specific index character "+str);
	
		StringBuilder bl = new StringBuilder(str);
	     bl.deleteCharAt(index);
		System.out.println(bl);
	}
}
