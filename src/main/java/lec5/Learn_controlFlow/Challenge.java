package lec5.Learn_controlFlow;

public class Challenge {

	public static void main(String[] args) {
	
		evenNumber();
		System.out.println();
		oddNumber();
		
	}

	public static void evenNumber() {
		
		System.out.println("The even number are: ");
		for(int i = 1; i<=100; i++)
		if(i %2 == 0) {
			
			System.out.print(" "+ i+ " ");
		}
	}
	
	
	public static void oddNumber() {
		
		System.out.println("The odd number are: ");
		for(int i = 1; i<=100; i++) {
			if(i % 2 != 0) {
				System.out.print(" " + i+ " ");
			}
		}
	}
	
}
