package com.bubblesort;

import java.util.Scanner;

public class Bubble_sort {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of Array :");
		int n=sc.nextInt();
		int arr[]=new int[n];
		
		
		
		for(int i=0;i<n;i++)
		{
			System.out.print("Enter the element"+(i+1)+" : ");
			arr[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<n-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					temp=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		
		System.out.println("bubble sort : ");
		
		for(int i=0;i<n;i++)
		{
			
			System.out.print(arr[i]+" ");
		}
		
	}

}
