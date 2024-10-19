package Variable;

import java.util.Scanner;

public class EmployeeMethodEx {
	
	
	public static void employeeunemp(int age)
	{
		if(age>=60)
			
		{
			System.out.println("Retired Person");
			
		}
		
		else if(age>=25 && age<60)
		{
		System.out.println("Working Person");
		}
		
		else if(age>=18 && age<25)
		{
		System.out.println("College student");
		}
		
		else if(age>=10 && age<18)
		{
		System.out.println("High school student");
		}
		
		else if(age>=6 && age<10)
		{
		System.out.println("Z.P Student");
		}
		
		else if(age>0 && age<6)
		{
		System.out.println("Nursery Student");
		}
		
		else
			
		{
			System.out.println("Invalid Input");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EmployeeMethodEx obj=new EmployeeMethodEx();
		
		 Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter age for checking that person employee or unemployee: ");
		
		int age=sc.nextInt();
		
		employeeunemp(age);

	}

}
