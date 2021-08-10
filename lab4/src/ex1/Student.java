package ex1;

public class Student {
	
	private int studentID;
	private String name,degree,mobile;
	private static int max=100;
	
	public Student()
	{
		
	}
	
	public Student(String name, String degree, String mobile) {
		this.name = name;
		this.degree = degree;
		this.mobile = mobile;
	}
	//getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	//static method for genarate unique student id
	public static int getNextStudentID() {
		return max++;
	}
	
	public void print(){
		System.out.println("Student Name: "+getName()+"\nStudent ID: "+getNextStudentID()+"\nStudent Degree: "+getDegree()+"\nMobile: "+getMobile());
	}
}
