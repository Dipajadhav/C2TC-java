package PatternPrinting;

import java.util.Scanner;

public class PrintTriangleEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
       Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter number to print Triangle: ");
		
		int n=sc.nextInt();
	     int k=1;
		for(int i=1; i<=n; i++)
			
		{
			
			
		   for(int j=1; j<=i; j++)
			   
		   {
			   
			   System.out.print(k);
			   k=k+2;
			   
		   }
		 
		   
			  System.out.println();
		}	
		

	}

}
