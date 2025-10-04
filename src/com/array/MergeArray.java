package com.array;

import java.util.Scanner;

public class MergeArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[]= {10,20,30};
		int brr[]= {40,50,60};
		
		int a1=arr.length;
		int b1 = brr.length;
		int c1 = a1+b1;
		
		int crr[]=new int[c1];
		
		for(int i=0; i<arr.length;i++)
		{
			crr[i] =  arr[i];
		}
		
		for(int i=0; i<brr.length;i++)
		{
			crr[a1+i] =brr[i];
		}
		
		for(int i=0; i<crr.length;i++)
		{
			System.out.print(crr[i]+"\t");
		}
	}

}
