package Variable;

import java.util.Scanner;

public class LogicalEx {

	public static void main(String[] args) {
		
       Scanner sc=new Scanner(System.in);
       
       System.out.println("Enter the value of A: ");
       int a=sc.nextInt();
       
       System.out.println("Enter the value of B: ");
       int b=sc.nextInt();
       
       System.out.println("Enter the value of C: ");
       int c=sc.nextInt();
       
       if(a==10 || b==20 && c==22)
       {
    	   System.out.println("Those values are same.");
    	   
    	   
       }
       
       else
       {
    	   System.out.println("Those values are different.");
       }
	}

}











