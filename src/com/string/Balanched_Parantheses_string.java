package com.string;

public class Balanched_Parantheses_string {
	public static boolean check(String str)
	{
		while (true) {
			if (str.contains("{}")) {
				str = str.replace("{}", "");
			}
			else if (str.contains("()")) {
				str = str.replace("()", "");
			}
			else if (str.contains("[]")) {
				str = str.replace("[]", "");
			}
			else
			{
				return str.isEmpty();
			}
		}

	}
	public static void main(String[] args) {
		String st = "{[()]}()";
		
		boolean bret =check(st);	
		
		if(bret)
		{
			System.out.println("Balanced");
		}
		else
		{
			System.out.println("Not Balanced");
		}
			
		}
		

}
