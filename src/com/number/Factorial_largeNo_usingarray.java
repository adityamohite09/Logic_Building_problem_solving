package com.number;

import java.util.Scanner;

public class Factorial_largeNo_usingarray {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		int arr[]= {10,20,40,8};
		
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}
		}
		int v=0;
		for(int j=1;j<max;j++)
		{
			if(max % j==0)
			{
				v=j;
			}
		}
		
		System.out.println("factorial of large number : "+v);
	}

}
