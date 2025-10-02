package com.array;

import java.util.Scanner;

public class SecondLargestelement {
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
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
				   temp=arr[j];
				   arr[j]=arr[i];
				   arr[i] =temp;
				}
			}
		}
		int slast=0;
		for(int i=0;i<arr.length-1;i++)
		{
			 slast= arr[i];
			
		}
		System.out.println("second Largest element : "+slast);
		
//		----------------------------------------------------------
//		int max=arr[0];
//		int sech=0;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i]>max && sech != max)
//			{sech = max;
//				max =arr[i];
//				
//				
//			}
//			
//		}
//		System.out.println("second highest "+sech);
	}
}
