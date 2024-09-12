package lec3_VariableScop;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VariableScop vs = new VariableScop();
		VariableScop.doAnotherThing();
		VariableScop.doSomethingElse();
		System.out.println(VariableScop.x);
		System.out.println(vs.x);
	}

}
