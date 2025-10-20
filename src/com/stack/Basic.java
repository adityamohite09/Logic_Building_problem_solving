package com.stack;

import java.util.Scanner;
import java.util.Stack;

public class Basic {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
//		Stack<Integer> s = new Stack<>();
//		s.push(2);
//		s.push(45);
//		s.push(32);
//		s.push(67);
//		s.push(12);
		
	//	System.out.println(s.peek());
	//	System.out.println(s);
	//	System.out.println(s.pop());
	//	System.out.println(s.size());
		
	// get first element
//		while(s.size()>1)
//		{
//			s.pop();
//		}
//		System.out.println(s.peek());
		
		
		//sort
		//s.sort(null);
		//System.out.println(s);
		
//      accept input from user
//		System.out.println("Enter the size : ");
//		int size =sobj.nextInt();
//		
//		for(int i=1;i<=size;i++)
//		{
//			System.out.println("Enter the element :"+i+" :");
//			int x =sobj.nextInt();
//			s.push(x);
//		}
//		System.out.println(s);
		
		Stack<Integer> st = new Stack<>();
		st.push(10);
		st.push(89);
		st.push(21);
		st.push(32);
		st.push(56);
		
		System.out.println("original stack 1 : "+st);
		
		Stack<Integer> rt = new Stack<>();
		while(st.size() > 0)
		{
			int y = st.pop();
			rt.push(y);
			
		}
		System.out.println("Reverse stack 2 : "+rt);
		 
		Stack<Integer> gt = new Stack<>();
		while(rt.size() > 0)
		{
			int y = rt.pop();
			gt.push(y);
			
		}
		System.out.println("copy as it is elements stack 3 : "+gt);
		System.out.println(st);
	}

}
