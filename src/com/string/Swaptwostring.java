package com.string;

public class Swaptwostring {
	public static void main(String[] args) {
		String str1 ="adii";
		String str2= "mohite";
		
		System.out.println("Before swapping : ");
		System.out.println(str1);
		System.out.println(str2);
		
		str1 = str1+str2;
		str2 = str1.substring(0,str1.length()-str2.length());
		str1 = str1.substring(str2.length());
		
		System.out.println("After swapping : ");
		System.out.println(str1);
		System.out.println(str2);
	}
}
