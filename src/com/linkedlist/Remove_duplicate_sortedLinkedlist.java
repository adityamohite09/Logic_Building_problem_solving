package com.linkedlist;

public class Remove_duplicate_sortedLinkedlist {
	public static void main(String[] args) {
		Node6 a = new Node6(5);
		Node6 b = new Node6(6);
		Node6 c = new Node6(6);
		Node6 d = new Node6(7);
		Node6 e = new Node6(8);
		a.next=b;
		b.next=c;
		c.next=d;
		d.next=e;
		e.next=null;
		int count =0;
		Node6 temp=a;
		Node6 head=a;
		
		 while(temp != null && temp.next != null)
		 {
		 if(temp.data == temp.next.data)
		   {
			 temp.next= temp.next.next;
		   }
		 else
		 {
			 temp = temp.next;
		 }
		
		 }
	
	Node6 print = head;
	 while (print != null) {
         System.out.print(print.data + " ");
         print = print.next;
     }

}
}
class Node6
{
	int data;
	Node6 next;
	
	Node6(int data){
		this.data=data;
	}
	
}
