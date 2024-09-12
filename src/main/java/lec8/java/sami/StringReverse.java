package lec8.java.sami;

public class StringReverse {

	static String sentence = "We are learning how to reverse strings. Can you figure it out?";

	public static void main(String[] args) {

		StringReverse obj = new StringReverse();
		System.out.println(obj.reverseString("lets see the result"));
		System.out.println(obj.isPalindrome("mom"));
	}
	
	boolean isPalindrome(String text) {
		boolean isPalindrome = false;
		
		String reversedString = reverseString(text);
		isPalindrome = reversedString.equals(text);
		
		return isPalindrome;
	}

	String reverseString(String input) {
		String reversedString = " ";

		char[] inputArr = input.toCharArray();
		int n = inputArr.length;

		char[] reversedArray = new char[n];
		int j = 0;
		for (int i = n - 1; i >= 0; i--) {
			reversedArray[j] = inputArr[i];
			j++;
		}
		reversedString = String.valueOf(reversedArray);
		return reversedString;

	}

	public void printReversedString() {
		String sentence = "this is fun to learn";
		char[] arr = sentence.toCharArray();
		int n = arr.length;
		for (int i = n - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}

}

