package com.number;

import java.util.Scanner;

public class PerfectNumber {
public static void main(String[] args) {
	Scanner sobj = new Scanner(System.in);
	
	System.out.println("Enter the Number That you want to check : ");
	int ival = sobj.nextInt();
	CheckPerfectnumber obj = new CheckPerfectnumber(ival);
	int iRet = obj.checkperfect();
	
	if (iRet == ival)
	{
		System.out.println("Perfect Number");
	}
	else
	{
		System.out.println("Not Perfect Number");
	}
	
}
}

class CheckPerfectnumber
{
	int no;
	CheckPerfectnumber(int no)
	{
		this.no = no;
	}
	
	public int checkperfect()
	{
		int i=0;
		int digit =0;
		int isum=0;
	for(i=1;i<no;i++)
	{
		if(no% i == 0)
		{
			isum +=i;
		}
	}
		
		return isum;
	}
	
}
