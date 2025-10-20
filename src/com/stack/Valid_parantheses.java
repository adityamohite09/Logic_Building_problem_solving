package com.stack;

public class Valid_parantheses {
	
	public static boolean paran(String str)
	{
		while(true)
		{
			if(str.contains("()"))
					{
				str = str.replace("()", "");
					}else if(str.contains("{}"))
					{
				str = str.replace("{}", "");
					}
					else if(str.contains("[]"))
					{
				str = str.replace("[]", "");
					}
					else
					{
						return str.isEmpty();
					}
		}
	}
	public static void main(String[] args) {
		String str="([{}]())";
	System.out.println(paran(str));
	
	}

}
