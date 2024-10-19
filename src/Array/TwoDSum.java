package Array;

import java.util.Scanner;

public class TwoDSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of First Array :");
		int a=sc.nextInt();
		
		System.out.println("Enter the Size of Second Array :");
		int b=sc.nextInt();
		
		System.out.println("Enter the Size of third Array :");
		int c=sc.nextInt();
		
		
		int arr[][]=new int[a][b];
		int arra[][]=new int[a][b];
		int array[][]=new int[a][b];
		
		for(int i=0; i<a; i++)
		{
			for(int j=0; j<b; j++)
			{
				arr[i][j]=sc.nextInt();
				arra[i][j]=sc.nextInt();
			}
			}
		
		for(int i=0; i<a; i++)
		{
			for(int j=0; j<b; j++)
			{
				 array[i][j]=arr[a][b]+arra[a][b];
			}
		}
	
		
	
	for(int i=0; i<a; i++)
	{
		for(int j=0; j<b; j++)
		{
			System.out.print("Addition of Two Array is :"+array[i][j]);
		}
		System.out.println();
	}
	}
	
}
