package com.string;

import java.util.Scanner;

public class Chk_containAlphabet {
	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the String :");
		String str = sobj.nextLine();
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if ((str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {

				count++;
			}
		}

		if (count == str.length()) {
			System.out.println("All alphabet ");
		} else {
			System.out.println("Not All Alphabet");
		}
	}

}
