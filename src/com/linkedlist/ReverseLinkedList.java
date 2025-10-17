 package com.linkedlist;

public class ReverseLinkedList {
	
	public static class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data=data;
		}
		
		
	}
public static void main(String[] args) {
	Node a= new Node(9);
	Node b= new Node(34);
	Node c= new Node(45);
	Node d= new Node(74);
	Node e= new Node(102);
	
	a.next=b;
	b.next=c;
	c.next=d;
	d.next=e;
	e.next=null;
	Node current=a;
	Node temp=a;
	System.out.println("original LinkedList :");
	while(temp != null)
	{
		System.out.print(temp.data+" ");
		temp= temp.next;
		
	}
	Node next=null;
	Node prev=null;
	System.out.println();
	
	while(current != null)
	{
		next = current.next;  
		current.next = prev;
		prev = current;
		current = next;
		
	}
	System.out.println("Reverse LinkedList Display :");
	while(prev != null)
	{
		System.out.print(prev.data+" ");
		prev = prev.next;
	}
}
}
