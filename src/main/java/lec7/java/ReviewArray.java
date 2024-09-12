package lec7.java;

public class ReviewArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		printEachLetter("Thuwaiba IS A HARD WORKING STUDENT");
	}

	public static void printEachLetter(String text) {
		
		char[] textArray = text.toLowerCase().toCharArray();
		int length = textArray.length;
		for(int i = 0; i<= length-1; i++) {
			System.out.print(textArray[i]);
		}
	}
}
