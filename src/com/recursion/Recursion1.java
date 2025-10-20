package com.recursion;
public class Recursion1 {
	public static int fact(int no)
	{
		if(no ==1)
		{
			return 1;
		}
		return no * fact(no-1);
	}
	public static void main(String[] args) {
	System.out.println(fact(3));
	}
}
