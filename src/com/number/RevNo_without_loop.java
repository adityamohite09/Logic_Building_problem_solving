package com.number;

public class RevNo_without_loop {
	public static void Rev(int n)
	{
		if(n == 0)
		{
			return;
		}
		
		System.out.println(n);
		Rev(n-1);
	}
public static void main(String[] args) {
	int no=20;
	Rev(no);
}
}
