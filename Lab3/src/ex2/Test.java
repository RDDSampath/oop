package ex2;
public class Test {
	public static void main(String[] args) {
		//object creation
		Student s1=new Student("Kamal","IT20646592","Matara");
		Student s2=new Student("Amal","IT20546985","Colombo");
		
		System.out.println("Student name : "+s1.name+"\nStudent Id :"+s1.dit+"\nStudent Address :"+s1.address+"\n");
		System.out.println("Student name : "+s2.name+"\nStudent Id :"+s2.dit+"\nStudent Address :"+s2.address);

	}

}
