package com.digit;

import java.util.Scanner;

public class Kaprekar {
	public static void main(String[] args) {

		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int no = sobj.nextInt();
		int copy = no;
		int sq = no * no;

		String l = Integer.toString(sq);
		int size = l.length();

		String str = Integer.toString(sq);

		int mid = size / 2;

		String firstpart = str.substring(0, mid);
		String secondpart = str.substring(mid);
		
		
		int left= Integer.parseInt(firstpart);
		int right =Integer.parseInt(secondpart);
		
		if(copy == (left+right))
		{
			System.out.println(" Kaprekar number ");
		}
		else
		{
			System.out.println("Not Kaprekar number ");
		}

	}

}
