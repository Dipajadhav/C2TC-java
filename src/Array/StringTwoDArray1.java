package Array;

import java.util.Scanner;

public class StringTwoDArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of row: ");
		int row=sc.nextInt();
		System.out.println("Enter the size of column: ");
		int col=sc.nextInt();
		sc.close();
		String arr[][]=new String[row][col];
		System.out.println("Please enter your string: ");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				arr[i][j]=sc.next();
			}
		}
		System.out.println("Given string in array: ");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		
		}

}
