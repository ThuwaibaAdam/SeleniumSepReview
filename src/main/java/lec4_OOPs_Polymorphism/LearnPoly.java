package lec4_OOPs_Polymorphism;

public class LearnPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x=10, y = 20, z = 30;
		
		int sumOfTwoNumbers = addition(10,20)+ z;
		System.out.println(sumOfTwoNumbers);
	}

	
	static int addition(int x, int y) {
		return x+y;
	}
}
