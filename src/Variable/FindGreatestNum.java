package Variable;

import java.util.Scanner;

public class FindGreatestNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter value of A: ");
		
		int a=sc.nextInt();
		
        System.out.println("Enter value of B: ");
		
		int b=sc.nextInt();
		
        System.out.println("Enter value of C: ");
		
		int c=sc.nextInt();
		
		sc.close();
		
		if(a>b && a>c)
		{
			System.out.println("A is greater: "+a);
			
		}
		
		else if(b>c && b>c)
		{
			System.out.println("B is greater: "+b);
			
		}		

		
		else 
			
			System.out.println("Cis greater: "+c);
	}

}
