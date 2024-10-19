package Variable;

import java.util.Scanner;

public class BitwiseEx {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Value of A: ");
		
		int a=sc.nextInt();
		
        System.out.print("Enter the Value of B: ");
		
		int b=sc.nextInt();
		
		System.out.println(a|b);
		
		System.out.println(a&b);
		
		System.out.println("Bitwise compliment: "+~a);//-(a+1)
	    
		
	}
}
