package Forloop;

import java.util.Scanner;

public class PrintEvenEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter nuber to initialize: ");
		
		int a=sc.nextInt();
		
        System.out.println("Enter nuber to check condition: ");
		
		int c=sc.nextInt();
		
		for(int i=a; i<=c; i++)
		{
		
          if(i%2==0)
          {
        	  System.out.println(i);
          }
          }
	}

}
