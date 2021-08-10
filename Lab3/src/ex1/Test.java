package ex1;

public class Test {

	public static void main(String[] args) {
		//object creation
		Student s1=new Student();
		s1.name="kamal";
		s1.dit="IT2064592";
		s1.address="Matara";
		
		Student s2=new Student();
		s2.name="Amal";
		s2.dit="IT2064592";
		s2.address="Colombo";
		
		System.out.println("Student name : "+s1.name+"\nStudent Id :"+s1.dit+"\nStudent Address :"+s1.address+"\n");
		System.out.println("Student name : "+s2.name+"\nStudent Id :"+s2.dit+"\nStudent Address :"+s2.address);

	}

}
