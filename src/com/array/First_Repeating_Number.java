package com.array;

public class First_Repeating_Number {
	public static void main(String[] args) {
		int arr[]= {10,20,30,20,50};
		boolean bret= false;
		int count=0;
		int catchre=0;
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			bret = false;
			for(int j=0;j<i;j++)
			{
				if(arr[i] == arr[j])
				{
					bret =true;
					catchre = j;
					break;
				}
			}
			
			if(bret)
			{
				continue;
			}
			
			count=0;
			for(int k=0;k<arr.length;k++)
			{
				if(arr[i]==arr[k])
				{
					count++;
				}
			}
			
			System.out.println(arr[i]+" count : "+count);
		}
	      System.out.println("index of element first repeting :"+(catchre+1));
	}
}
