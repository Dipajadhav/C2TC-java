package Variable;

import java.util.Scanner;

public class PalindromeEx {

	public static void main(String[] args) {

	// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to check palindrome or not: ");
		int n=sc.nextInt();
		int temp=n;
		int rev=0;
		int rem=0;
		while(temp!=0)
		{
			rem=temp%10;	
		
			rev=rev*10+rem;
         
             temp=temp/10;
		}
		if(rev==n)
		{
			System.out.println("Number is Palindrome"+n);
		}
		
		else
		{
			System.out.println("Number is Not Palindrome"+n);
		}
		
	}
	
}

