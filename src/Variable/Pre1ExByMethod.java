package Variable;

public class Pre1ExByMethod {

	
	public void percentage1(int java, int c, int cpp, int python, int sql) 
	{
		int sum=java+c+cpp+python;
		int per=sum/5;
		System.out.println("percentage of all subjects: "+per+"%");
		
		if(per>=75 && per<100)
		{
			System.out.println("First class with distiction: "+per+"%");
		}
		
		else if(per>=60 && per<75)
		{
		
			System.out.println("First class: "+per);
		}
		else if(per>=35 && per<60)
		{
		
			System.out.println("Pass...: "+per);
		}
		
		else
			
		{
			System.out.println("Failed...: "+per);
		}	
	}	
	public static void main(String[] args) {
		
		Pre1ExByMethod obj=new Pre1ExByMethod();
		
		obj.percentage1(88,98,95,85,75);
	}

}
