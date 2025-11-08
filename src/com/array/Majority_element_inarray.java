package com.array;

public class Majority_element_inarray {
	public static void main(String[] args) {
		int arr[]= {2,2,1,1,1,2,2};
		int n=arr.length;
		int u=0;
		int count =0;
		int half=arr.length/2;
		boolean bret =false;
		
		for(int i=0;i<arr.length;i++)
		{
			count=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[j] == arr[i])
				{
					count++;
				}
			}
			if(count>half)
			{
				System.out.println("majority element "+arr[i]);
				bret = true;
				break;
			}
		}
		
		if(!bret)
		{
			System.err.println("not found");
		}
		
		
		
	}
}
