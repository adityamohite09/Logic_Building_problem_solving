package com.array;

public class Find_Freq_each_element {
	public static void main(String[] args) {
		int arr[] = { 10, 20, 20, 40, 50 };
		int count = 0;
		boolean bret = true;
		for (int i = 0; i < arr.length; i++) {
			
			bret = false;
			for (int j = 0;j<i; j++) {
				if (arr[i] == arr[j]) {
					
				bret=true;
				break;
				}
			}
			if(bret) {
			
			continue;
			}
			count = 1;
		for(int k=i+1;k<arr.length;k++)
		{
			if(arr[i]==arr[k])
					{
			count++;
					}
		}
		System.out.println(arr[i]+" count : "+count);
		}
		
		
	}
	}

