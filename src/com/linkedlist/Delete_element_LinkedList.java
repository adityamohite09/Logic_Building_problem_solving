package com.linkedlist;

public class Delete_element_LinkedList {
	public static void main(String[] args) {
		

		Node5 a = new Node5(5);
		Node5 b = new Node5(87);
		Node5 c = new Node5(52);
		Node5 d = new Node5(53);
		Node5 e = new Node5(45);
		
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=null;
		int count =0;
		
		Node5 temp=a;
		 b.data = b.next.data;
		    b.next = b.next.next;
		while(temp != null)
		{
		   
		    count++;  
		    System.out.println(temp.data);
		   
			temp = temp.next;
		}
		System.out.println("Length of LinkedList : "+count);
		
	}

}

class Node5
{
	int data;
	Node5 next;
	
	Node5(int data){
		this.data=data;
	}
	
}
