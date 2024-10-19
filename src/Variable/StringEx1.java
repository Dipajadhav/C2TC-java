package Variable;

import java.util.Scanner;

public class StringEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter the string: ");
		String str=sc.next();
		
		String str1="Hello";
		
		if(str1.equals(str))
		{
		
		System.out.println("Those words are same.");
	}
		else
		{
			System.out.println("Those words are differnt.");
		}
			
		}
}
