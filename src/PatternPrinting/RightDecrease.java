package PatternPrinting;

import java.util.Scanner;

public class RightDecrease {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Print the Right Decrease :");
		int n=sc.nextInt();
		for(int i=1; i<=n; i++)
			
		{
			for(int j=1; j<=i-1; j++)
				
	{
				System.out.print(" ");
				
			}
			for(int k=i; k<=n; k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	
	}
		
	}


