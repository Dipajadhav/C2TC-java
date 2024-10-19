package Variable;

import java.util.Scanner;

public class ArmstroMeth {
	
	static int count(int num ) 
	{
		int count=0;
		while(num!=0)
		{
			num=num/10;
			count++;
		
		}
		return count;
	}
	void armstrong(int n){
	int rem=0;
	int temp=n;
	double res=0;
	
	while(temp!=0)
	{
		rem=temp%10;
		res=res+Math.pow(rem, count(n));
		temp=temp/10;
	}
	if(n==res)
	{
		System.out.println("Given number is armstrong.");
	}
	
	else
	{
    System.out.println("Given number is not armstrong.");
	}
	
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArmstroMeth obj=new ArmstroMeth();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to checck number is armstrong or not:");
		int n=sc.nextInt();
		obj.armstrong(n);

	}

}
