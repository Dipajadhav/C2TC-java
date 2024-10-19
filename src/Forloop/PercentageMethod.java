package Forloop;

import java.util.Scanner;

public class PercentageMethod {
	
	public void percentage(int java, int c, int cpp, int python, int sql) 
	{
		
		int sum=java+c+cpp+python;
		
		
		int per=sum/5;
		System.out.println("percentage of all subjects: "+per+"%");
		
		
		if(per>=75 && per<100)
		{
			System.out.println("First class with distinction: "+per+"%");
		}
		
		else if(per>=60 && per<75)
		{
		
			System.out.println("First class: "+per);
		}
		else if(per>=35 && per<60)
		{
		
			System.out.println("Pass...: "+per);
		}
		
		else
			
		{
			System.out.println("Failed...: "+per);
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PercentageMethod obj=new PercentageMethod();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the Marks of Java Subject: ");
		
		int java=sc.nextInt();
		
        System.out.println("Enter the Marks of C Subject: ");
		
		int c=sc.nextInt();
		
        System.out.println("Enter the Marks of Cpp Subject: ");
		
		int cpp=sc.nextInt();
		
         System.out.println("Enter the Marks of Python Subject: ");
		
		int python=sc.nextInt();
		
		
        System.out.println("Enter the Marks of sql Subject: ");
		
		int sql=sc.nextInt();
		
		obj.percentage(java,c,cpp,python,sql);
		

	}

}
