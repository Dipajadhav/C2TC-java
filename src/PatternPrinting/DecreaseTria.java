package PatternPrinting;

import java.util.Scanner;

public class DecreaseTria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number to print decrease triangle: ");
		
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}

}
