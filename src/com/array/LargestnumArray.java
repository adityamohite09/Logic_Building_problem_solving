package com.array;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class LargestnumArray {
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
		int maxx=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>maxx)
			{
			maxx=arr[i];
			}
		}
		System.out.println("Largest Number : "+maxx);
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(10);
//		list.add(20);
//		list.add(30);
//		list.add(40);
//		list.add(50);
//		
//		for(int i :list)
//		{
//			System.out.println(i);
//		}
		
		
//		LinkedList<Integer> link=new LinkedList<>();
//		link.add(1);
//		link.add(2);
//		link.add(3);
//		link.remove(2);
//		System.out.println("Print List : "+link);
	}
}
