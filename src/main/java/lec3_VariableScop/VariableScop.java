package lec3_VariableScop;

public class VariableScop {
	//Global / instance
	static int x = 10;
	
	 void doSomething() {
		 // local
		 int y;
	 }
	 
	static void doSomethingElse() {
		 x = 5;
		 System.out.println(x);
	 }
	static void doAnotherThing() {
		 x = 55;
		 System.out.println(x);
	 }
}
