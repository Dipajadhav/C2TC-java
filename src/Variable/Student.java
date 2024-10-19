package Variable;

public class Student {

	private int roll_no;
	private String name;
	private String address;
	private int marks;
	

	public int getRoll_no() {
		return roll_no;
	}


	public void setRoll_no(int roll_no) {
		this.roll_no = roll_no;
	}



	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}




	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}


	public int getMarks() {
		return marks;
	}


	public void setMarks(int marks) {
		this.marks = marks;
	}
	

	@Override
	public String toString() {
		return "Student [roll_no=" + roll_no + ", name=" + name + ", address=" + address + ", marks=" + marks + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

	}

}
