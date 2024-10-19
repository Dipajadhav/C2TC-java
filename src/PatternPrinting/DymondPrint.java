package PatternPrinting;

import java.util.Scanner;

public class DymondPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Print Dymond: ");
		int n=sc.nextInt();
		
		for(int i=1; i<=n; i++)
			
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print(" ");
			
			}
			
			for(int k=1; k<=i; k++)
				
			{ 
				System.out.print("*");
			}	
				for(int k=2; k<=i; k++)
					
				{
					System.out.print("*");
				}
				
				System.out.println();
			}
		
		
		//reverse pyrmid
		
		
		for(int i=1; i<=n; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print(" ");
			}
			for(int k=i; k<=n; k++) {
				System.out.print("*");
			}
			for(int k=i+1; k<=n; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
