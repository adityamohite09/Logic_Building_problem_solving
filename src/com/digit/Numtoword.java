package com.digit;

import java.util.Scanner;

public class Numtoword {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int no = sobj.nextInt();
		String sd[]= {" ","one","two","three","four","five","six","seven","eigth","nine","ten","eleven","tewale","thirty","fourtheen","fifteen","sixteen","seventeen","eighteen","nineteen"};
		String ty[]={"","ten","twenty","thirty","fourty","fifty","sixty","seventy","eigthty","ninety","twenty"};
		String hd= "hundred";
		String th= "thousand";
		
		
		int last = no % 10;
		int rlast = no / 10;
		
		int mid = rlast % 10;
		int rmid = no /10;
		
		int i = rmid % 10;
		int op = no/10;
		
		
		if(no > 1 && no <=11)
		{
			
			System.out.println(sd[no]);
		}
		else if(no > 12 && no <=20)
		{
			
			System.out.println(ty[no]);
		}
		else if(no> 21 && no<=100)
		{
			System.out.println(ty[mid]+" "+sd[last]);
		}
		else 
		{
			System.out.println(sd[i]+" "+hd+" "+ ty[mid]+sd[last]);
		}
	}
}
