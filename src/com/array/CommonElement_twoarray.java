package com.array;

import java.util.Scanner;

public class CommonElement_twoarray {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		int arr[]= {10,20,30};
		int brr[]= {10,50,20};
		int a= arr.length;
		int b=brr.length;
		int c= a+b;
		int crr[]=new int[c];
		for(int i=0;i<a;i++)
		{
			crr[i] = arr[i];
		}
		
		for(int i=0;i<b;i++)
		{
			crr[a+i] = brr[i];
		}
		
		System.out.println("Common element in two array : ");
		for(int i=0;i<c;i++)
		{
				for(int j=i+1;j<c;j++)
				{
					if(crr[i] == crr[j])
					{
						System.out.print(crr[j]+"\t");
					}
				}
		}		
		
	}

}
