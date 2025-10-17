package com.linkedlist;

public class Baisxc {
	public static class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
		}
	}
	public static void main(String[] args) {
		Node a = new Node(1);
		Node b = new Node(3);
		Node c = new Node(4);
		Node d = new Node(5);
		//1->3->4->5
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=null; 
//		System.out.println(a.data);
//		System.out.println(a.next);
//		System.out.println(b.data);
//		System.out.println(b.next);
//		System.out.println(c.data);
//		System.out.println(d.data);
		
		Node temp =a;
//		for(int i=1;i<5;i++)
//		{
//			System.out.println(temp.data);
//			temp= temp.next;
//		}
		
		while(temp != null)
		{
			System.out.println(temp.data);
			temp=temp.next;
		}
	
	}

}
