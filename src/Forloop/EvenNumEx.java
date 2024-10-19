package Forloop;

import java.util.Scanner;

public class EvenNumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number to check even number or odd: ");
		
		int num=sc.nextInt();
		
		if(num%2 ==0)
		{
		System.out.println("Given number is even: "+num);

	}
		else
		{
			System.out.println("Given number is odd: "+num);
		}
	}

}

