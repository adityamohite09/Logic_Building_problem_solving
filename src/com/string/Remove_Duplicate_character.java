package com.string;

public class Remove_Duplicate_character {
	
		public static void main(String[] args) {
			String str ="aabbcca";
			String neww="";
			for(int i=0;i<str.length()-1;i++)
			{
				if(str.charAt(i) != str.charAt(i+1))
				{
					neww = neww + str.charAt(i);
				}
			}
			System.out.println(neww);
		}

	}
