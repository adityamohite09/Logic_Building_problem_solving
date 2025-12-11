package com.string;
public class Firstnon_repeatingcharacter {
	public static void main(String[] args) {
		String str = "aabbpoddee";
		boolean bret = false;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			count = 0;
			for (int j = 0; j < str.length(); j++) {
				if (str.charAt(i) == str.charAt(j)){
					count++;
				}
			}
			if (count == 1) {
				System.out.println(str.charAt(i) + " first non reapting : " + count);
			}
		}
		
		if(!bret)
		{
			System.out.println("No non-repating character found");
		}
	}
}
