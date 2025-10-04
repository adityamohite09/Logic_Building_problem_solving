package com.array;

import java.util.Scanner;

public class Removeduplicateelement {
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
		int i=0;
		int j=0;
		int count=0;
//		for( i=0;i<arr.length;i++)
//		{
//			for( j=i+1; j<arr.length-1;j++)
//			{
//				if(arr[i] == arr[j])
//				{
//					j++;
//					arr[j]=arr[i];
//					count++;
//				}
//			}
//		}
//		------------------------------------------
		for( i=0;i<arr.length;i++)
			{
				
					if(arr[i] != arr[j])
					{
						j++;
						arr[j]=arr[i];
						count++;
					}
			}
		System.out.println("Remove Duplicate element in array : ");
		for( i=0;i<j;i++)
		{
			System.out.print(arr[i]+"\t");
	
		}
	}
}
