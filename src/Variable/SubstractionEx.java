package Variable;

import java.util.Scanner;

public class SubstractionEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the value of A: ");
		
		int a=sc.nextInt();
		
		System.out.print("Enter the value of B: ");
		
		int b=sc.nextInt();
		
		int res=a-b;
		
		System.out.print("Substraction of A&B is: "+res);
	}

}
