package com.selectionsort;

import java.util.Scanner;

public class Selection_sort {
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
		int smallestelement=0;
		int temp=0;
		for(int i=0;i<n-1;i++)
		{
			smallestelement=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[smallestelement]) {
					smallestelement=j;
				}
				temp=arr[smallestelement];
				arr[smallestelement]=arr[i];
				arr[i]=temp;
			}
		}
		System.out.println("Selection sort : ");
		for(int i : arr)
		{
			System.out.print(i+"\t");
		}
	}

}
