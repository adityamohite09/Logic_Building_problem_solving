package com.array;

import java.util.Scanner;

public class Moveallzeroright {
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
	int temp=0;
	int k=0;
	for( i=0;i<arr.length;i++)
	{
		
			if(arr[i] != 0 )
			{
				
				arr[j++]=arr[i];
				
				count++;
			}
		
	}
	for( j=count;j<arr.length;j++)
	{
		arr[j]=0;
		
	}
	System.out.println("move to all 0 in end of array : ");
	for( i=0;i<j;i++)
	{
		System.out.print(arr[i]+"\t");
	}
	
}
}
