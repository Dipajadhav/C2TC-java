package Variable;

import java.util.Scanner;

public class PowerCal {
	
	public static int power(int a, int b)
	{
		int res=1;
		for(int i=1; i<=b; i++)
		{
			res=res*a;
		}
			return res;	
	}
	int count(int n) {
		
		int count=0;
		while(n!=0)
		{
		n=n/10;
		count++;
		}
		return count;
	}
	
	void armstrong(int num)
	{
	
		int rem=0;
		double res=0;
		int temp=num;
		
		while(temp!=0)
		{
		
			rem=temp%10;
			res=res+power(rem,count(num));
			temp=temp/10;
			
		}
		if(num==res)
		{
			System.out.println("Given number is amstrong: ");
		}
		else {
			System.out.println("Given number is not amstrong: ");
		}
		
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PowerCal obj=new PowerCal();
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of A: ");
		int a=sc.nextInt();
		System.out.println("Enter the value of B: ");
		int b=sc.nextInt();
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		System.out.println("Enter the value of num: ");
		int num=sc.nextInt();
		obj.power(a,b);
		obj.armstrong(num);
		
		

	}

}
