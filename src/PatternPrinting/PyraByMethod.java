package PatternPrinting;

import java.util.Scanner;

public class PyraByMethod {
		
	public void pyramid(int n)
	{
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
		
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		PyraByMethod obj=new PyraByMethod();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Print Pyramid :");
		
		int n=sc.nextInt();
		obj.pyramid(n);
	}

}
