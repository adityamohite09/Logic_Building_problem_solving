package com.string;
import java.util.Scanner;

public class ReplaceAll_String {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the String");
		String str = sobj.nextLine();
		
		String rep=str.replaceAll("@","_");
		
		System.out.println("After replace : "+rep);
	}
}
