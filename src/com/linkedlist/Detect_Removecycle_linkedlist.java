package com.linkedlist;

public class Detect_Removecycle_linkedlist {
	public static class Node
	{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
		}
	}
	public static void main(String[] args) {
	   Node a = new Node(1);
	   Node b = new Node(2);
	   Node c = new Node(3);
	   Node d = new Node(4);
	   Node e= new Node(5);
	   
	   a.next=b;
	   b.next=c;
	   c.next=d;
	   d.next=e;
	    e.next=c;
	   Node Head = a;
	   Node slow =Head;
	   Node fast =Head;
	  
	   boolean bret = false;
	   
	   while(fast != null && fast.next != null)
	   {
		   slow = slow.next;
		   fast =fast.next.next;
		   if(slow == fast)
		   {
			   bret = true;
			   break;
		   }
	   }
	   
	  if(bret)
	  {
		  System.out.println("Loop Present inside LinkedList");
	  }
	   else
	   {
		   System.out.println("Not Loop in LinkedList");
	   }
	  
	  slow = Head;
	  Node prev =null;
	  while(slow != fast)
	  {
		  slow = slow.next;
		  prev = fast;
		  fast= fast.next;
	  }
	  prev.next=null;
	  System.out.println(slow.data);
	  
	
	  
	}

}
