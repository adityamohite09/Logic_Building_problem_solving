package com.string;

public class Count_Vowels_Consonants {
	public static void main(String[] args) {
		
		String str = "hello world";
		int vcount=0;
		int con=0;
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			if(ch == 'a' || ch == 'A' ||ch == 'o' || ch == 'O'||ch == 'u'||ch == 'U'||ch == 'i'||ch == 'I'|| ch == 'e'||ch == 'E')
			{
				vcount++;
			}
			else 
			{
				if(ch == ' ') {
					continue;
				}
				con++;
			}
		}
		
		System.out.println("Vowel count = "+vcount);
		System.out.println("Conseuent count = "+con);
		
	}

}
