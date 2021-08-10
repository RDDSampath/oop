package ex1;

public class lab1 {

	public static void main(String[] args) {
		int i=1;
		while(i<6){
			i=i++;
			System.out.println("*****");
		}
		
		int x=5;
		for (int k = x; k >= 1; --k) {
			for (int j = 1; j <= k; ++j) {
				System.out.print(j + " ");
			}
			System.out.println();
		}

	}

}
