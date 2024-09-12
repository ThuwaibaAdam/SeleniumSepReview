package lec5.Inheritance;



public class Test_Inheritance {

	public static void main(String[] args) {
		
		
		
		Car bmw = new Car("car", "Motor", "White", "bmw", "ms 15", 4, 4, "manual", 6, 8, 685,60);
		
		
		bmw.accelerate();
		
		Vehicle hyndai = new Vehicle("car", "Motor", "Sky blue", "hyndai", "Elantra");
		
		hyndai.accelerate();
		
	}
		

	
		
		
		//"car", "Motor", "white","bmw", "ms", 4, 4,"manual", 6, 8, 9 ,2
	
		/*
		 * Car astonMartin = new Car();
		 *  boolean isInstance = astonMartin instanceof
		 * Vehicle;
		 *  System.out.println(isInstance);
		 */

		/*
		 * Car hyndai = new Car(); 
		 * hyndai.numOfDoors = 3;
		 *  hyndai.typeOfEngine = "motor";
		 */
		
		
		
		
	

}
