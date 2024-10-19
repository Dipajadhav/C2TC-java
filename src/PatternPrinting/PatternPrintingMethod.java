package PatternPrinting;

import java.util.Scanner;

public class PatternPrintingMethod {
	
	public void printsquare(int n) {
		
		for(int i=1; i<=n; i++)
			
		{
		   for(int j=1; j<=n; j++)
			   
		   {
			   System.out.print("* ");
			   
			   
		   }
		   
		   System.out.println();
		}
		   
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PatternPrintingMethod obj=new PatternPrintingMethod();
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the number for printing square: ");
		
		int n=sc.nextInt();	
		
		obj.printsquare(n);
		
		

	}

}
