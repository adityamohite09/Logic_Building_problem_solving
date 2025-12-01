package com.string;

import java.util.Scanner;

public class RemoveSpace {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str =  sobj.nextLine();
		str = str.replaceAll("//s", "");
		System.out.println("After removing All space : "+str);
	}
}
