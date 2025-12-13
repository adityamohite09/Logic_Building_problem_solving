package com.string.substring;

public class Count_Occurence_Substring {
	public static void main(String[] args) {
		String str = "abababa";

		String substring = "aba";
		boolean bret = false;
		int count = 0;
		for (int i = 0; i < str.length(); i++) {

			for (int j = 0; j < substring.length(); j++) {

				if (str.charAt(i) == substring.charAt(j)) {

					count++;
				}

			}
			if (count == substring.length()) {
				bret = true;
				break;
			}

		}
		System.out.println(count);

	}

}
