package com.stack;

import java.util.Stack;

public class Next_Greater_element_usingstack {
	public static void main(String[] args) {
		int arr[]= { 1,3,2,1,8,6,3,4};
		
		int res[]=new int[arr.length];
		Stack<Integer> st = new Stack<>();
		res[arr.length-1]=-1;
		st.push(arr[arr.length-1]);
		
		
		for(int i=arr.length-2;i>=0;i--)
		{
			while(st.size()> 0 && st.peek()<arr[i]  )
			{
				st.pop();
			}
			if(st.size() == 0)
			{
				res[i]=-1;
			}
			else
			{
				res[i]=st.peek();
				
			}
			st.push(arr[i]);
		}
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " --> " + res[i]);
        }
	}

}
