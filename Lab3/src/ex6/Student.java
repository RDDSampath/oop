package ex6;

public class Student extends Person {
	String StudentId;

	public Student(String name, String address, String studentId) {
		super(name, address);
		StudentId = studentId;
	}

	@Override
	void showDetails() {
		// TODO Auto-generated method stub
		super.showDetails();
	}

	
	

}
