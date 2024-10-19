package SwitchCase;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your choice to perform operation: ");
	int choice=sc.nextInt();
	
		System.out.println("Enter first number: ");
		int a=sc.nextInt();
		System.out.println("Enter second number: ");
		int b=sc.nextInt();
		
	switch(choice)
	{
	case 1:
	{
		
		System.out.println("Addition of two numbers: "+(a+b));
		break;
	}
	case 2:
	{
		System.out.println("Substraction of two numbers: "+(a-b));
		break;
	}
	case 3:
	{
		System.out.println("Multiplication of two numbers: "+(a*b));
		break;
	}
	case 4:
	{
		System.out.println("Division of two numbers: "+(a/b));
		break;
	}
	default:
	{
	System.out.println("Invalid Input: ");
	}
		

	}

}
}