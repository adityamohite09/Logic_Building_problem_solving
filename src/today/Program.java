package today;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter userId : ");
		int id = sobj.nextInt();
		int temp = id;
		int rev =1;
		int idigit =0;
		while( id != 0)
		{
			idigit = id % 10; 
			rev += rev*10 +idigit;
			id = id / 10;
		}
		
		if(temp == rev)
		{
			System.out.println("user");
		}
		
		
		
	}
}
