package Variable;

public class TestEx {
	
	void method1()
	{
	System.out.println("Hello this is interface 11");
	}
	
	void method2(int a)
	{
		System.out.println("Program execute succesfully");
	}
	
	void test(LoanEx L)
	{
		System.out.println("loan example");
	}
	
	void stud(Student S)
	{
	
	}
	
	public static void main(String args[])
	{
		
	Student s=new Student();
	TestEx m=new TestEx();
	m.method1();
	m.method2(4);
	LoanEx loan=new LoanEx();
	loan.setId(4);
	loan.setName("Dipali");
	loan.setPlace("Pune");
    m.test(loan);
    System.out.println("Loan Details: "+loan);
    m.stud(s);
    s.setRoll_no(5);
    s.setName("Reshma");
    s.setAddress("Katraj");
    s.setMarks(59);
     System.out.println("Student Details: "+s);
	}
}
