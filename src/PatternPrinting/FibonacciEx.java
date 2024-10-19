package PatternPrinting;

import java.util.Scanner;

public class FibonacciEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A: ");
		int a=sc.nextInt();
		System.out.println("Enter the value of B: ");
		int b=sc.nextInt();
		int count=10;
		for(int i=0; i<count; ++i)
		{
           int c=a+b;
           System.out.println(a+"+"+b+ "="+c);
           a=b;
           b=c;
	}

	}
	}
