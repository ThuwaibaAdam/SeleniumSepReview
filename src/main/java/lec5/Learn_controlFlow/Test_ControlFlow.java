package lec5.Learn_controlFlow;

public class Test_ControlFlow {

	public static void main(String[] args) {
		
		ControlFlow sub = new ControlFlow();
		
		int exam1 = 91;
		int exam2 = 60;
		int exam3 = 98;
		int exam4 = 80;
		int exam5 = 74;
		int exam6 = 70;
		
		System.out.println(sub.getGrade(exam6));
		System.out.println(sub.getGrade(exam5));
		System.out.println(sub.getGrade(exam4));
		System.out.println(sub.getGrade(exam3));
		System.out.println(sub.getGrade(exam2));
		System.out.println(sub.getGrade(exam1));
	}

}
