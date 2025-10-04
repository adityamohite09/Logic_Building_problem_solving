package com.array;

public class Even_Threearray {
public static void main(String[] args) {
	int arr[]= {1,2,3};
	int brr[]= {11,12,13};
	int crr[]= {61,62,63};
	int a= arr.length;
	int b = brr.length;
	int c=crr.length;
	int three = a+b+c;
	
	int evenarray[]=new int[three];
	
	int i=0;
	for(i=0;i<a;i++)
	{
		evenarray[i]= arr[i];
	}
	for(i=0;i<b;i++)
	{
		evenarray[a+i]= brr[i];
	}
	for(i=0;i<c;i++)
	{
		evenarray[(a+b)+i]= crr[i];
	}
	int j=0;
	System.out.println("Even element in all three array :");
	for(i=0;i<three;i++)
	{
		
			if(evenarray[i] % 2 ==0)
			{
				System.out.println(evenarray[i]);
			}
		
	}
}
}
