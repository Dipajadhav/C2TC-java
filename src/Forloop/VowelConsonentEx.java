package Forloop;

import java.util.Scanner;

public class VowelConsonentEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the alphabet: ");
		
		char n=sc.next().charAt(0);
		
		if(n=='a' || n=='e' || n=='i'|| n=='o' ||n=='u')
		{
			
      System.out.println("alphabet is vowel"+n);
	}

		else
		{
			System.out.println("alphabet is consonen"+n);
		}
	}
}
