package Whileloop;

import java.util.Scanner;

public class WhileEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for print table: ");
		int n=sc.nextInt();
		int i=1;
		while(i<=10)
		{ 
			System.out.println(n+" x "+i+" = "+(i*n));
			i++;
		}
		
}
}

