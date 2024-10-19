package Array;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[][]= {{1,2},{2,3}};
		
		int b[][]=new int[a.length][a.length];
		
		System.out.println("Copy  of array: ");
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<b.length; j++) 
			{
					b=a;
			System.out.print(b[i][j]+" ");
			}
			System.out.println();
			}
		}		
}