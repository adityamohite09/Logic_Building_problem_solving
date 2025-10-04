package com.array;

import java.util.Scanner;

public class ReverseArray {
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
		System.out.println("Reverse Array is : ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.print(arr[i]+"\t");
		}
	}
}
