package Variable;

import java.util.Scanner;

public class VotingEx {

	
	public void voting(int age)
	
	{
		if(age>=18)
			
		{
			System.out.println("Eligible for voting");

		}
		else
			
		{
			System.out.println("Not eligible for voting");
			
		}
		
		System.out.println("voting is completed");
	}
	
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VotingEx obj=new VotingEx();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the age: ");
		
		int a=sc.nextInt();
		
		obj.voting(a);
	}

}
