package Forloop;

import java.util.Scanner;

public class ForloopEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number for print table: ");
		
		int a=sc.nextInt();
		
		sc.close();
		
		for(int i=1; i<=10; i++)
		{
			System.out.println(a+" x "+i+ " = "+(a*i));
		}	
	}
}
