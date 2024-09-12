package methods_lec_2;

public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Calculator.addition(20, 30);
		Calculator.subtraction(30, 20);
		System.out.println(Calculator.division(100, 2));
		System.out.println(8*8*Calculator.multiplication(5, 10));
		int division = Calculator.multiplication(5, 10);
		System.out.println(division);
	}

}
