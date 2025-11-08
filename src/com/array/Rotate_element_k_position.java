package com.array;

import java.util.Scanner;

public class Rotate_element_k_position {
	public static void main(String[] args) {
//		Scanner sobj = new Scanner(System.in);
//		
//		System.out.println("Enter the size");
//		int size = sobj.nextInt();
//		
//		int arr[]=new int[size];
//		for(int i=0;i<size;i++)
//		{
//			System.out.print("Enter the element :"+(i+1)+" :");
//			arr[i]=sobj.nextInt();
//		}
//		
//		for(int i=0;i<size;i++)
//		{
//			System.out.print(arr[i]+" ");
//		
//		}
//		
//		System.out.println("Enter Position of k : ");
//		int k=sobj.nextInt();
		
		
		int arr[]= {5,10,15,20};
		int k=5;
		int j=0;
		if(k>arr.length)
		{
			k=k%arr.length;
		}
		System.out.println("Original array : ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int brr[]=new int[arr.length];
		
		for(int i=k;i<arr.length;i++)
		{
			brr[j++]=arr[i];
		}
		for(int o=0;o<k;o++)
		{
			brr[j++]=arr[o];
		}
		System.out.println("after k position change array : ");
		for(int l:brr)
		{
			System.out.print(l+" ");
		}
	}

}
