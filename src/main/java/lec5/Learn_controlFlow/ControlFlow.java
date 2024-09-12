package lec5.Learn_controlFlow;

public class ControlFlow {

	public String getGrade(int grade) {
		String lGrade = "";
		
		if(grade < 65) {
			lGrade = "F";
		}else if(grade < 75) {
			lGrade = "D";
		}else if (grade < 80) {
			lGrade = "C";
		}else if (grade <90) {
			lGrade = "B";
		}else {
			lGrade = "A";
		}
		
		return lGrade;
	}
}
