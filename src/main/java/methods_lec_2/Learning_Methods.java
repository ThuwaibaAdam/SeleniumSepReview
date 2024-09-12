package methods_lec_2;

import accessModifiers.AccessModifier;

public class Learning_Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AccessModifier.printName();
	//	AccessModifier.
		doSomething();
		int z = doSomethingElse();
		System.out.println(5+z);
		System.out.println(5 + doSomethingElse());
		System.out.println(doSomethingElse());
	}
	
	static void doSomething() {
		System.out.println("This method is doing something");
	}
	
	static int doSomethingElse() {
		int x = 5; 
		int y = 10;
		
		return x+y;
	}

}
