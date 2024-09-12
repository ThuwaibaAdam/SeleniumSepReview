package learnScanner;

import java.util.Scanner;

public class LearnScanner {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter 1ST number: ");
		int x = scan.nextInt();
		
		System.out.print("Enter 1ST number: ");
		int y = scan.nextInt();
		
		System.out.println("The value of addition "+doAddition(x,y));
		System.out.println("The value of subtraction "+doSubtraction(x,y));
		System.out.println("The value of multiplication "+doMultiplication(x,y));
		System.out.println("The value of division "+doDivision(x,y));
		
	
	
	
	}

	static int doAddition(int num1, int num2) {
		return num1+num2;
	}
	

	static int doSubtraction(int num1, int num2) {
		return num1-num2;
	}
	

	static int doMultiplication(int num1, int num2) {
		return num1*num2;
	}
	

	static int doDivision(int num1, int num2) {
		return num1/num2;
	}
	
	
	
	
	
	
}
