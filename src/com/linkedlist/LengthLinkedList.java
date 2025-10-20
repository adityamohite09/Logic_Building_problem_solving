package com.linkedlist;

public class LengthLinkedList {
	public static void main(String[] args) {
		Node4 a = new Node4(5);
		Node4 b = new Node4(87);
		Node4 c = new Node4(52);
		Node4 d = new Node4(53);
		Node4 e = new Node4(45);
		
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=null;
		int count =0;
		
		Node4 temp=a;
		while(temp != null)
		{
			System.out.println(temp.data);
			count++;
			temp = temp.next;
		}
		System.out.println("Length of LinkedList : "+count);
		
	}

}

class Node4
{
	int data;
	Node4 next;
	
	Node4(int data){
		this.data=data;
	}
	
}