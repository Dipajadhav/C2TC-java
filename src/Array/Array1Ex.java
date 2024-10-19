package Array;

import java.util.Scanner;

public class Array1Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[]=new int[6];
		 arr[0]=20;
		
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<arr.length; i++)
		{
		arr[i]=sc.nextInt();

	}
		for(int i=0; i<arr.length; i++)
		{
System.out.println(arr[i]);
}
}
	}