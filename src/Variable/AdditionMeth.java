package Variable;

import java.util.Scanner;

public class AdditionMeth {
	
	public int addition(int p, int q) {
		
		System.out.println("addition of two numbers is: " +(p+q));
		
		return 0;
	}
	
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AdditionMeth obj=new AdditionMeth();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A: ");
		int a=sc.nextInt();
		
		System.out.println("Enter the value of B: ");
		int b=sc.nextInt();
		obj.addition(a, b);

	}

}
