package lec5.Learn_controlFlow;

public class Review_For_Each_loop {

	public static void main(String[] args) {
	
		int x = 0;
		
		while (x<10) {
			x++;
			System.out.println("x equal: "+x);
			
		}
		
		do {
			System.out.println("LOOP "+ x + ": we are learning Java");
			x++;
		}while(x>10);
		
	
		}
		
		public void myArray() {
			int[] myArray = {2, 3, 4, 5, 88, 99, -20};
			
			for(int x : myArray) {
				
				System.out.println(x);
			}
		
		
	}

	
	
	
	
	
	
	
	
	
	
}
