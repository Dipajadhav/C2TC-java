package Whileloop;

import java.util.Scanner;

public class EvenExWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter number to start print even numbers: ");
		int i=sc.nextInt();
		
		System.out.println("enter number to end print even numbers: ");
		int n=sc.nextInt();
		 
		while(i<=n)
			
		{   
			if(i%2==0)
				
			{
				System.out.println("Even numbers:"+i);
			}
				i++;
		}
		
	}

}
