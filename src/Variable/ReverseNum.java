package Variable;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to re132"
				+ "verse the given number: ");
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
		System.out.println("The reverse of given number is : "+rev);
		}
	}














































































































