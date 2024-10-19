package Variable;

import java.util.Scanner;

public class MethodEx {

	public int addition(int p, int q)
	{
		
		
		
		System.out.println("addition of A&B: "+(p+q));
		
		return 0;
		
	 }
	   public static void main(String[] args) {
		
		
		
       
		MethodEx obj=new MethodEx();
				
		        //int a=10;
				//int b=20;
       
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter the value of A: ");
        int a=sc.nextInt();
       
        System.out.println("Enter the value of B: "); 
        int b=sc.nextInt();
		
         int res=a+b;
				
	     int result=obj.addition(a,b);
			
	
	}
	
}
	
	
	
	
	