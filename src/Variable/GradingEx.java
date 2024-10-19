package Variable;

import java.util.Scanner;

public class GradingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the pecentage to check the graade: ");
		
		int grade=sc.nextInt();
		
		if (grade>=90)
		{
			System.out.println("Grade A: "+grade);
		}
		
		else if(grade>=80 && grade<90) {
			System.out.println("Grade B: "+grade);
			
		}
		
		else if(grade>=70 && grade<80) {
			System.out.println("Grade C: "+grade);
		}
		
		else if(grade>=0 && grade<70) {
			System.out.println("result is failed");
			
		}	
		else 
		{
			System.out.println("Invalid Input");
		}
		
	}

}
