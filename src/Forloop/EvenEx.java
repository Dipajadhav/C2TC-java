package Forloop;

import java.util.Scanner;

public class EvenEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		
		int num=sc.nextInt();
		
		System.out.println("Enter second number: ");
		
		int num1=sc.nextInt();
		
		for(int i=num; i<=num; i++)		
		{
			if(!(i%2==0))
			{
			System.out.println(i);
			}
		}

	}

}


