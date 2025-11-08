package com.array;

public class Right_rotate_array {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		
		int k=2;
		int p=0;
		int brr[]=new int[arr.length];
		int n=arr.length;
		for(int i=n-k;i<n;i++)
		{
			brr[p++]=arr[i];
		}
		
		for(int j=0;j<n-k;j++)
		{
			brr[p++]=arr[j];
		}
		
		for(int y:brr)
		{
			System.out.print(y+" ");
		}
		
	}

}
