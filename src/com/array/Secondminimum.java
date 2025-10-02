package com.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Secondminimum {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);

//		System.out.println("Enter the size :");
//		int size = sobj.nextInt();
//		int arr[] = new int[size];
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print("Enter the Element :" + (i + 1) + " : ");
//			arr[i] = sobj.nextInt();
//		}
//		int temp = 0;
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[j] > arr[i]) {
//					temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		}
//		
//		for (int k = 0; k < arr.length; k++) {
//			System.out.print(arr[k]+"\t");
//		}
//
//		System.out.println("second minimum : " + arr[1]);
		
//--------------------------------------------------------------
//		int min=arr[0];
//		int smin=arr[0];
//		
//		for (int i = 0; i < arr.length; i++) {
//			if(arr[i]<min && smin != min)
//			{
//				smin=min;
//				min=arr[i];
//			}
//		}
//		System.out.println("Second minimum element is : "+smin);
//-------------------------------------------------------
//		ArrayList<Integer> list = new ArrayList<>();
//		list.add(10);
//		list.add(12);
//		list.add(34);
//		list.add(3);
//		System.out.println(list);
//		
//		Collections.sort(list);
//		System.out.println("sorted list : "+list);
		
//		---------------
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(12);
		list.add(34);
		list.add(3);
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println("sorted Linkedlist : "+list);
	}

}
