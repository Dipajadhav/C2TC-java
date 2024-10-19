package Variable;

import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		/*	System.out.print("Enter the number: ");

		int a=sc.nextInt();
		System.out.println("This is a given number: "+a);
		*/
		
		System.out.print("Enter the value of A: ");

		int a=sc.nextInt();
		
		
		System.out.print("Enter the value of B: ");

		int b=sc.nextInt();
		
		int res=a+b;
		
		System.out.println("Addition of A&B: "+res);	
		
	}

}
