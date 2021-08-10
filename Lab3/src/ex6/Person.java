package ex6;

public class Person {
	String name,id,address,age;

	
	public Person(String name, String address) {
		this.name = name;
		this.address = address;
	}


	void showDetails() {
	System.out.println("My name is "+name+"\nI am from "+address);
	}

}