 package com.today;
public class Program {
	public static void main(String[] args) {
        int arr[] = {5, 10, 15, 20, 25};
        int k = 7;
        int j=0;
        int n = arr.length;
        
        if(k>arr.length)
        {
        	k=k%arr.length;
        }
        int brr[]=new int[arr.length];
        for(int i=k; i<=arr.length-1;i++)
        {
        	brr[j++]=arr[i];
//        	System.out.println(arr[i]);
        }
        
        for(int m=0; m<k;m++)
        {
        	brr[j++]=arr[m];
//        	System.out.println(arr[i]);
        }
        
        
        for(int i=0; i<brr.length;i++)
        {
        	System.out.println(brr[i]);
        }
        
       
	}

}
