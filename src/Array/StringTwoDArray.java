package Array;

import java.util.Scanner;

public class StringTwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		
		String arr[][]=new String[n][n];
		System.out.println("Please enter your string: ");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				arr[i][j]=sc.next();
			}
		}
		System.out.println("Given string in array: ");
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
