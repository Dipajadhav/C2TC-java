package Variable;

import java.util.Scanner;

public class CountMeth {
	
	
	public void countnum(int n ) 
	{
		int count=0;
		while(n!=0)
		{
			n=n/10;
			count++;
		}
		System.out.println(count);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountMeth obj=new CountMeth();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		obj.countnum(n);
		

	}

}
