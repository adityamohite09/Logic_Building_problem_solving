package com.string;

import java.util.Scanner;

public class Sort_UsingBubblesort {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
		String str =sobj.nextLine();
		
		char arr[]=str.toCharArray();
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]> arr[j+1])
				{
					char temp= arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=temp;
				}
			}
		}
		String st = new String(arr);
		System.out.println("Sort : "+st);
	}

}
