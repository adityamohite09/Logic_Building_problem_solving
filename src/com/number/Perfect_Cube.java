package com.number;

import java.util.Scanner;

public class Perfect_Cube {
	
	
		public static void main(String[] args) {
			Scanner sobj = new Scanner(System.in);
			
			System.out.println("Enter the number that you want to check :");
			int ino = sobj.nextInt();
			boolean bret = false;
			
			int i=0;
			for(i=1;i<=ino;i++)
			{
				if(i*i*i == ino)
				{
					bret =true;
				}
			}
			
			if(bret)
			{
				System.out.println("Perfect cube Number : "+ino);
			}
			else
			{
				System.out.println("Not Perfect cube Number : "+ino);
			}
		}


}
