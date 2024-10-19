package Variable;

import java.util.Scanner;

public class FactorialMeth {
	
	public static void factorial(int n)
	{
	
		int fact=1;
		for(int i=1; i<=n; i++)
		{
		
		fact=fact*i;
	}
	
	System.out.println(fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		FactorialMeth.factorial(n);
	}

}
