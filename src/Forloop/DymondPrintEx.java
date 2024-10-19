package Forloop;

public class DymondPrintEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=4; i++)
		{
			for(int j=i; j<=4; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=i; k++)
			{
				System.out.print("*");
			}
				for(int l=2; l<=i; l++)
				{
					System.out.print("*");
				}
			System.out.println();
		
		}
		
		
		//2nd 
		
		for(int i=4; i>=1; i--)
		{
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			for(int k=i; k>=1; k--)
			{
				System.out.print("*");
			}
				for(int l=i; l>=2; l--)
				{
					System.out.print("*");
				}
			System.out.println();
		
		}
		
		}
	}

