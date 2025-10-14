package com.string;

import java.util.Scanner;

public class Check_VOWELS {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String copy = str;
		String Rev = "";
		boolean bret = false;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'a') {
				bret = true;
				break;
			}
		}
		if (bret) {
			System.out.println("contain vowel");
		} else {
			System.out.println("Not Vowel");
		}
	}
}
