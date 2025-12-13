package com.string;

import java.util.HashMap;
import java.util.Scanner;

public class Isomorphic_String {
	
	public static boolean isIso(String s, String t)
	{
		if(s.length() != t.length())
		{
			return false;
		}
		
		HashMap<Character,Character> map1 = new HashMap<>();
		HashMap<Character,Character> map2 = new HashMap<>();
		
		for(int i=0;i<s.length();i++)
		{
			char ch1 = s.charAt(i);
			char ch2 = t.charAt(i);
			
			if(map1.containsKey(ch1))
			{
				if(map1.get(ch1) != ch2)
				{
					return false;
				}
			}
				else
				{
					map1.put(ch1, ch2);
				}
			
			
			if(map2.containsKey(ch2))
			{
				if(map2.get(ch2) != ch1)
				{
					return false;
				}
			}
				else
				{
					map2.put(ch2, ch1);
				}
			
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter String 1 :");
		String str1=sobj.nextLine();
		
		System.out.println("Enter String 2 :");
		String str2=sobj.nextLine();
		
		
		boolean bret = isIso(str1,str2);
		if(bret)
		{
			System.out.println("Isomorphic string ");
		}
		else
		{
			System.out.println("Not Isomorphic String");
		}
	}

}
