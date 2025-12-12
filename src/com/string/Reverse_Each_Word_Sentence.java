package com.string;

public class Reverse_Each_Word_Sentence {
	public static void main(String[] args) {
		String sentence = "Java is fun";
		String word[] = sentence.split(" ");

		String newstr = "";
		for (int i = 0; i < word.length; i++) {
			for (int h = word[i].length() - 1; h >= 0; h--) {
				char ch = word[i].charAt(h);
				newstr = newstr + ch;

			}
			newstr = newstr + " ";
		}
		System.out.println(newstr);

	}
}
