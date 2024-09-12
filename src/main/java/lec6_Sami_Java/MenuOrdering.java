package lec6_Sami_Java;

import java.util.Scanner;

public class MenuOrdering {

	
static	Scanner stdin = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		String welcomingMsg = " Welcome to BOBs Burgers! What would you like to order?\n";
		String menu = "\t1 - BURGERS\n\t2 - SIDES\n\t3 - DRINKS";
		
		
		System.out.println(welcomingMsg);
		System.out.println(menu);
		
		System.out.println("\nPlease make your selection: ");
	
		String menuSelection = stdin.next();
	
	}

}
