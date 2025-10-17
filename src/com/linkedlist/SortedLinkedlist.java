package com.linkedlist;

public class SortedLinkedlist {
	
	public static void main(String[] args) {
		Node a = new Node(5);
		Node b = new Node(87);
		Node c = new Node(52);
		Node d = new Node(53);
		Node e = new Node(45);
		
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=null;
		
		
		Node temp=a;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
		
	}

}

class Node
{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
	}
	
}
