package lec5.Learn_controlFlow;

import java.util.ArrayList;

public class Learn_For_Each_Loop {

	public static void main(String[] args) {
		
		
		ArrayList<String> myList = new ArrayList<String>();

		myList.add("Thuwaiba");
		myList.add("Sami");
		myList.add("Gurava");
		myList.add("Zohra");
		
		for(String s: myList) {
			System.out.println(s);
		}
		
		int[] intArray = {23, 333, 3202, -20, 99, 44, 91};
		
		for (int x : intArray) {
			System.out.println(x);
		}
		
	}

}
