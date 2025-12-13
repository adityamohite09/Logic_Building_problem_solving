package com.string.substring;

public final class Check_Substring_Exists {
	public static void main(String[] args) {
		String str = "sadbutsad";

		String substring = "sad";
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
		if (bret) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}

	}

}
