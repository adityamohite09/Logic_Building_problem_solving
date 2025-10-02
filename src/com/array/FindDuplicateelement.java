package com.array;

import java.util.Scanner;

public class FindDuplicateelement {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the size :");
		int size = sobj.nextInt();
		int arr[] = new int[size];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Enter the Element :" + (i + 1) + " : ");
			arr[i] = sobj.nextInt();
		}
		int temp = 0;
		System.out.println("Duplicate element are : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] == arr[i]) {
					System.out.print(arr[j] + "\t");
				}
			}
		}
	}

}
