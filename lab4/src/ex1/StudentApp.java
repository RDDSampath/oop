package ex1;

public class StudentApp {
	public static void main(String args[]){
		//Array student object
		Student stArray[]=new Student[5];
		
		stArray[0]=new Student("Amali","Bsc","0711712745");
		//stArray[0].print();
		
		stArray[1]=new Student("kamal","Msc","0711745645");
		//stArray[1].print();
		
		stArray[2]=new Student("saman","esc","0711659875");
		//stArray[2].print();
		
		//using setters and getters
		stArray[3]=new Student();
		stArray[4]=new Student();
		stArray[5]=new Student();
		
		stArray[3].setName("Amal");
		stArray[3].setDegree("msc");
		stArray[3].setMobile("0712888952");
		//stArray[3].print();
		
		stArray[4].setName("kamal");
		stArray[4].setDegree("bsc");
		stArray[4].setMobile("0712885552");
		//stArray[4].print();
		
		stArray[5].setName("nimali");
		stArray[5].setDegree("phd");
		stArray[5].setMobile("0712845852");
		//stArray[5].print();
		
		//for loop to print details
		for(int i=0;i<5;i++) {
			stArray[i].print();
		}
	}
}
