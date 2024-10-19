package Variable;

import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int flag=0;
		for(int i=2; i<num; i++)
		{
		if(num%i==0)
		{
			System.out.println("Number is not Prime:"+num);
			
			flag=1;
			break;
			
		}
		}
		if(flag==0)
		{
			System.out.println("Number is prime: "+num);
			
			}
		
		
	}
}






		
		
		
		
		
		
		
		
		
		
		
		
		
		

	


