package Variable;

import java.util.Scanner;

public class LocalVariableEx {

	
	
	public void addition(double p, double q)
	{
		
		
		
		System.out.println("addition of A&B: "+(p+q));
		
	 }
	   public static void main(String[] args) {
		
		
		
       LocalVariableEx obj=new LocalVariableEx();

		
		        //int a=10;
				//int b=20;
       
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter the value of A: ");
        double a=sc.nextFloat();
       
        System.out.println("Enter the value of B: ");
        double b=sc.nextFloat();
		
        
        
				
		obj.addition(a,b);
		
		
	}

}

