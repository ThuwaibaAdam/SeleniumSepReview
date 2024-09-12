package stringPractice;

public class WidingCasting {
 
	static short myShort = 4332;
	static int convertedInt;
	static long convertedLong;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// casting
		// Widening 
		convertedInt =  myShort;
		convertedLong =  myShort;
		// Narrowing 
		int num1 = 50000;
		short shortNum = (short) num1;
		System.out.println(shortNum);
		
		double myDouble = 50.328232002802;
		float myFloat = (float) myDouble;
		System.out.println(myFloat);
		
		int myInt = 333333333;
		short myShort = (short)myInt;
		System.out.println(myShort);
		
		long myLong = 999997989;
		short myShortIn = (short) myLong;
		int myIntIn = (int) myLong;
		System.out.println(myIntIn);
		System.out.println(myShortIn);
		
		// primitive to non-primitive
		
		int age = 25;
		String myString = String.valueOf(age);
		System.out.println("Wrapper Classes"+age + 20);
		
		String myAge = "25";
		int myAgeW = Integer.valueOf(myAge);
		System.out.println("Wrapper classes "+( 20 + myAgeW));
		
		
		
		
		
		
	}

}
