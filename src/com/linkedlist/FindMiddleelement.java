package com.linkedlist;

import java.util.LinkedList;

public class FindMiddleelement {
	public static void main(String[] args) {
		
		Node2 a= new Node2(2);
		Node2 b= new Node2(4);
		Node2 c= new Node2(9);
		Node2 d= new Node2(5);
		Node2 e= new Node2(3);
		a.next =b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=null;
		Node2 temp=a;
		
		Node2 slow=a;
		Node2 fast = a;
		while(fast != null && fast.next != null)
		{
			slow = slow.next;
			fast = fast.next.next;
		}
		
		System.out.println("Middle Node are : "+slow.data);
		
	}
}
 class Node2
{
	int data;
	Node2 next;
	
	Node2(int data)
	{
		this.data=data;
	}
	
}