package com.string;

public class TwoString_differ_onedigit {
	public static void main(String[] args) {
		String str1="cat";
//		String str2="cut"
		String str2="cast";
		int count=0;
		int nount=0;
		for(int i=0;i<str1.length();i++)
		{
			char ch1 =str1.charAt(i);
			char ch2 =str2.charAt(i);
			
			
			if(ch1 == ch2)
			{
				count++;
			}
			if(ch1 != ch2)
			{
				nount++;
			}
			
		}
		System.out.println(count);
		int n1=str1.length();
		int n2=str2.length();
		if(str2.length()== str1.length() || str2.length()>str1.length() )
		{
			if(n1-count == 1)
			{
				System.out.println("differ by 1");
			}
			if(n2-count == 1)
			{
				System.out.println("differ by 1");
			}
		}
	}

}
