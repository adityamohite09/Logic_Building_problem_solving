package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class Reversestring_stack {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		String str =sobj.nextLine();
	
		Stack<Character> st = new Stack<>();
		for(int i=0;i<str.length();i++)
		{
			char ch = str.charAt(i);
			st.push(ch);
		}
		
		while(st.size()  > 0)
		{
			System.out.print(st.pop());
		}
	}

}
