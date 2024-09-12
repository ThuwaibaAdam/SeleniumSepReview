package methods_lec_2;

public class ParametersAndArgs {

	public static void main(String[] args) {
		
		add();
		add(11, 32);
	}
	
	static void add() {
		int a = 5;
		int b= 20;
		System.out.println(a + b);
	}
	static void add(int a, int b) {
		System.out.println(a + b);
	}
}
