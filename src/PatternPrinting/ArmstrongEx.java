package PatternPrinting;

import java.util.Scanner;

public class ArmstrongEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to checck number is armstrong or not:");
		int n=sc.nextInt();
		
		int rem=0;
		double res=0;
		int temp=n;
		
		while(temp!=0)
		{
			rem=temp%10;
			res=res+Math.pow(rem, 3);
			temp=temp/10;
		}
		if(n==res)
		{
			System.out.println("Number is armstrong");
		}
		
		else
		{
        System.out.println("Number is not armstrong");
	}
		

}
}
