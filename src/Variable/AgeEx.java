package Variable;

import java.util.Scanner;

public class AgeEx {

	public static void main(String[] args) {
		
		
Scanner sc=new Scanner(System.in);
/*
System.out.print("Enter age: ");
int age=sc.nextInt();



if(age>=18)
{
System.out.println("Eligible for voting ");

}
else
{
	System.out.println("Not eligible for voting ");
}
*/
System.out.print("Enter age: ");
int age=sc.nextInt();



if(age<=18)
{
System.out.println("Not eligible for voting ");

}
else
{
	System.out.println("Eligible for voting ");
}
	}

}
