package Array;

public class AddTwoD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{1,2,3},{2,3,4}};
		
		int b[][]= {{1,2,3},{2,3,4}};
		int c[][]=new int[2][3];
		System.out.println("Addition of two array: ");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<3; j++) {
				
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
			}
		}

	}


