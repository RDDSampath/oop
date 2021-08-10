
package ex3;
import java.util.Scanner;

public class A {

	public static void main(String[] args) {
		Scanner myScan = new Scanner(System.in);
		
		System.out.println("Height Enter= ");
		int height=myScan.nextInt();
		System.out.println("Width Enter= ");
		int width=myScan.nextInt();
		System.out.println("Length Enter= ");
		int length=myScan.nextInt(); 
		
		double volume=(height*width*length);
		System.out.println("Volume is= "+volume);

	}

}
