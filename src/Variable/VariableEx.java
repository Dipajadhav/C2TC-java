package Variable;

public class VariableEx {

	int a=10;//Instance variable
	static int b=10;//Static variable
	public static void show()
	{
		int a=10;//local variable
		
		System.out.println(a+b);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VariableEx obj=new VariableEx();
		System.out.println("Addition of A&B: ");
		show();
	}

}
