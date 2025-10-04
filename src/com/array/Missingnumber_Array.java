package com.array;

import java.util.Scanner;

public class Missingnumber_Array {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the size :");
		int size = sobj.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("Enter the Element :"+(i+1)+" : ");
			arr[i]=sobj.nextInt();
		}
		int sum=0;
		int fectch=0;
		for(int i=0;i<arr.length;i++)
		{
			sum += arr[i];
			fectch = arr[i];
			
		}
		int n = fectch*(fectch+1)/2;
		
		int miss = n- sum;
	System.out.println("Missing value is : "+miss);
	
	}
}
