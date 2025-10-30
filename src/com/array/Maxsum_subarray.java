package com.array;

import java.util.Scanner;

public class Maxsum_subarray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of array : ");
		int no = sc.nextInt();
		int []arr=new int[no];
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter the element"+(i+1)+":");
			arr[i]=sc.nextInt();
		}
		boolean bret =false;
		int count=0;
		for(int h=0;h<arr.length;h++)
		{
			if(arr[h]>0)
			{
				count++;
			}
		}
		int sum=0;
		int i,j,k=0;
		int max=0;
		System.out.println("All possible sub array : ");
		for(i=0;i<arr.length;i++)
		{
			if(count == 0)
			{
				max=arr[0];
				for(int h=0;h<arr.length;h++)
				{
					if(arr[h]>max)
					{
						max = arr[h];
						
					}
				}
			}
			for(j=i;j<arr.length;j++)
			{
				System.out.print("{");
				sum=0;
				
				for(k=i;k<=j;k++)
				{
					
					System.out.print(arr[k]+" ");
					sum +=arr[k];
					
					if(sum > max)
					{
						max=sum;
					}
				}
				System.out.print("}");
			}
		}
		System.out.println("");
		System.out.println("sum of maximun sub array : "+max);
	}

}
