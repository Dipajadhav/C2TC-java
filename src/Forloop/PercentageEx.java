package Forloop;

import java.util.Scanner;

public class PercentageEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enetr the marks of Java Subject: ");
		int java=sc.nextInt();
		
		System.out.println("Enetr the marks of C Subject: ");
		int c=sc.nextInt();
		
		System.out.println("Enetr the marks of CPP Subject: ");
		int cpp=sc.nextInt();
		
		System.out.println("Enetr the marks of Python Subject: ");
		int python=sc.nextInt();
		
		System.out.println("Enetr the marks of sql Subject: ");
		int sql=sc.nextInt();
		
		int sum=java+c+cpp+python+sql;
		
		int per=sum/5;
		
		System.out.println("Percentage of all subjects marks is: "+per+"%");
		
		
		if(per<=60 && per<75)
			
		{
		    System.out.println("First Class With Distiction");
		    
		    
		}
		
		else if(per<=35 && per<60)
			
		{
		    System.out.println("First Class");

	}
		else if(per<=35)
		{
			System.out.println("Pass");
		}
		
		else
		{
			System.out.println("Fail");
		}
		}
	}


