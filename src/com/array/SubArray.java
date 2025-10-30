package com.array;

public class SubArray {
	public static void main(String[] args) {
		int []arr= {1,2,3};
		int fe=0;
		for(int i=0;i<arr.length;i++)
		{
			fe= arr[i];
		}
		
		int allsubarray= fe*(fe+1)/2;
		
		System.out.println(allsubarray);
		
		
		int i,j,k=0;
		
		System.out.println("All posible sub array : ");
		for(i=0;i<arr.length;i++)
		{
			for(j=i; j<arr.length;j++)
			{
				System.out.print("{");
				for(k=i;k<=j;k++)
				{
					System.out.print(arr[k]+" ");
				}
				System.out.print("}");
			
			}
		}
	}

}
