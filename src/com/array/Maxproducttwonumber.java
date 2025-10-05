package com.array;

import java.util.Scanner;

public class Maxproducttwonumber {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	
	System.out.println("Enter the Size of Array :");
	int no = sc.nextInt();
	
	int i,j,k=0;
	int[]arr= new int[no];
	for(i=0;i<arr.length;i++)
	{
		System.out.print("Enter the element "+(i+1) +" :");
		arr[i]=sc.nextInt();
	}
	int pro=1;
	int maxpro=0;
	for(i=0;i<arr.length;i++)
	{
		if(arr[i] ==0)
		{
			arr[i]=1;
		
		}
		pro=1;
		for(j=i+1;j<arr.length;j++)
		{
			if(arr[i] <0 && arr[j]<0)
			{
				arr[i]=-arr[i];
				arr[j]=-arr[j];
			} 
		
			if(arr[j] ==0)
			{
				arr[j]=1;
			
			}
			pro = arr[i]*arr[j];
		
			
			if(pro > maxpro)
			{
				maxpro=pro;
			}
		}
	}
	System.out.println("Maximum Product of two number : "+maxpro);

}
}
