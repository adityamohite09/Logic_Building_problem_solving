package com.string;

import java.util.Scanner;

public class Firstnonrepeting_character {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the String : ");
	    String str =sobj.nextLine();
	    boolean bret=false;
	    
	    int count=0;
	    for(int i=0;i<str.length();i++)
	    {char ch1=str.charAt(i);
	    count=1; 
	    	for(int j=i+1;j<str.length();j++)
	    	{
	    		char ch2=str.charAt(i);
	    		if(ch1 !=ch2)
	    		{
	    			count++;
	    		}
	    	
	    	}
	    	  System.out.println(ch1+" : "+count);
	    }
	  
	}
}
