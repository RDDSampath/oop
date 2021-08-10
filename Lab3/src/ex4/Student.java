package ex4;

public class Student{
	private String name,ditno,address;
	
	String getDetails(){
	String s="I am Student.\nMy name is "+getName()+"\nI am from "+getAddress()+"\nMy dit no is "+getDitno();
	return s;
	}
	//DEFAULT CONSTRUCTOR
	public Student(){
	}
	
	//parameterized Constructor
	public Student(String newname,String newditno,String newaddress){
	this.name=newname;
	this.ditno=newditno;
	this.address=newaddress;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDitno() {
		return ditno;
	}

	public void setDitno(String ditno) {
		this.ditno = ditno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
}

