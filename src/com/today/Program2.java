package com.today;

public class Program2 {
	public static void main(String[] args) {
//		int arr[]= {1,4,5,2,7,8,3};
		int arr[]= {3,1,5,3,3,3};
		int j=0;
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] % 2 ==0)
			{
				arr[j]=arr[i];
				System.out.println(arr[j]);
			}
			
			
		}
		for(int k=0;k<arr.length;k++)
		{
			if(arr[k] % 2 !=0)
			{
				arr[j+k]=arr[k];
			System.out.println(arr[k]);
			}	
		}
		
		
	}

}
