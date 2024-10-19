package Variable;

import java.util.Scanner;

public class BetwiseOpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the first value A: ");
		int a=sc.nextInt();
		System.out.println("Enter the first value B: ");
		int b=sc.nextInt();
		
		System.out.println(a&b);
		System.out.println(a|b);
		System.out.println(~a);
	
	}
}
