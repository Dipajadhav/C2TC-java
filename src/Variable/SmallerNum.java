package Variable;

import java.util.Scanner;

public class SmallerNum {
	
	public void smaller(int a, int b, int c)
	{
		
			if(a<b && a<c)
			{
				System.out.println("A is smaller: "+a);
				
			}
			
			else if(b<c && b<c)
			{
				System.out.println("B is smaller: "+b);
				
			}		

			
			else 
			{
				System.out.println("C is smaller: "+c);
		}

		
		}
	

	public static void main(String[] args) {
		
		SmallerNum obj=new SmallerNum();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of A: ");
		
		int a=sc.nextInt();
		
        System.out.println("Enter value of B: ");
		
		int b=sc.nextInt();
		
        System.out.println("Enter value of C: ");
		
		int c=sc.nextInt();
		
		obj.smaller( a,b,c);

	}

}
