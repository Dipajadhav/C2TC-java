package Array;

import java.util.Scanner;

public class SingleArrayAdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n=sc.nextInt();
		System.out.println("Enter your array elements: ");
		int arr[]=new int[n];
		int sum=0;
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
		
		sum=sum+arr[i];
		
	}
		System.out.println("Sum of array elements: "+sum);

}
}