package com.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class PrintAllelement {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter size");
		
		LinkedList<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		System.out.println(list);
		
		
		
	}
}
