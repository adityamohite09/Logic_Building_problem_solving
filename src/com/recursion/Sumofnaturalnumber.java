package com.recursion;

public class Sumofnaturalnumber {
	public static void sum(int i,int n,int sum)
	{
		if(i==0)
		{
			sum+=i;
			System.out.println(i);
			return;
		}
		sum+=i;
		 sum(i+1,n,sum);
		 System.out.println(sum);
	}
public static void main(String[] args) {
	sum(1,5,0);
}
}
