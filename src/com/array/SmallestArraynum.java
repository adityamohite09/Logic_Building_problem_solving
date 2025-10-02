package com.array;

import java.util.Scanner;

public class SmallestArraynum {
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
			int minn=arr[0];
			for(int i=0;i<arr.length;i++)
			{
				if(arr[i]<minn)
				{
				minn=arr[i];
				}
			}
			System.out.println("Smallest Number : "+minn);
			
		}
}
