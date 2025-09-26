package com.number;

public class PrintPrime2 {
	public static void main(String[] args) {
		
		int i = 0;
		boolean bret = false;
		int count = 0;
		int no=0;
		for(no=2;no<=100;no++)
		{
		bret = true;
		for (i = 2; i < no; i++) {

			if (no % i == 0) {
				bret = false;
				count++;
				break;

			}

		}

		

		if (bret) {
			System.out.println(no + " ");
		} 
	}
	}

}
