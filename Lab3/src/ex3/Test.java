package ex3;

public class Test{
	public static void main(String args[]){
		//student object
		Student st=new Student();
		st.setName("kamal");
		st.setDitno("it20646592");
		st.setAddress("matara");
		
		System.out.println("Student Name: "+st.getName()+"\nStudent Id: "+st.getDitno()+"\nAddress: "+st.getAddress());
	}
}
