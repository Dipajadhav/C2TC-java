package Variable;

import java.util.Scanner;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		int flag=0;
		for(int i=2; i<n; i++)
			
		{
			
			if(n%i==0)
			{
				
				flag=1;			
				
			}
		}
			
			if(flag==0)
				
			{
				  
				System.out.println("Number is prime: "+n);
			}
			
			else {
			
			System.out.println("Number is not prime:"+n);
			
			
			}		
	}

}
