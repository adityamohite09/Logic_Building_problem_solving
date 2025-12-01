package com.string;

import java.util.Arrays;
import java.util.Scanner;

public class Sort_Character {
public static void main(String[] args) {
	Scanner sobj = new Scanner(System.in);
	
	System.out.println("Enter the String : ");
	String str =sobj.nextLine();
	char []arr=str.toCharArray();
	Arrays.sort(arr);

	String nstr = new String(arr);
	
	System.out.println("Sorted String : "+nstr);
	
}

}
