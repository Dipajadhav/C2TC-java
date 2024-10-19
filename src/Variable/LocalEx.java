package Variable;

import java.util.Scanner;

public class LocalEx {

	
	public  void checkregistration(String pass1,String pass2)
	
	{
		if(pass1.equals(pass2))
		{
			System.out.println("Those passswords are matched");
		}
		else
		{
			System.out.println("Those passswords are different");
		}
	}
	
	public static void main(String[] args) 
	
	{
	
		LocalEx obj=new LocalEx();
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the pass1: ");
		String pass1=sc.next();
		
		
		System.out.println("Enter the pass1: ");
		String pass2=sc.next();
		
 obj.checkregistration(pass1,pass2);
 
	}

}
