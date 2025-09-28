package com.number;

public class Decimal_binary_octal_hexd {
	
	public static void main(String[] args) {
		int o=100;
//		String binary = Integer.toBinaryString(o);
//		String octal = Integer.toOctalString(o);
//		String hexd = Integer.toHexString(o);
		
		for(int i=1;i<=100;i++)
		{
		
		String binary = Integer.toBinaryString(i);
		String octal = Integer.toOctalString(i);
		String hexd = Integer.toHexString(i);
		
		
		System.out.println("Decimal : "+i+"| binary : "+binary+" "+"| octal : "+octal+"| hexdecimal : "+hexd);
	}
	}

}
