package lec5.Learn_controlFlow;

public class LearnSwitch {

	public String getMonth(int month) {
		String monthName = "";
		
		switch(month) {
		case 1:
			monthName = "January";
			break;
		case 2:
			monthName = "Feb";
			break;
		case 3:
			monthName = "March";
			break;
		case 4:
			monthName = "April";
			break;
		case 5: 
			monthName = "May";
			break;
		case 6: 
			monthName = "June";
			break;
		case 7: 
			monthName = "July";
			break;
		case 8:
			monthName = "August"; 
			break;
		case 9:
			monthName = "September";
			break;
		case 10:
			monthName = "October";
			break;
		case 11:
			monthName = "November";
			break;
		case 12:
			monthName = "December";
			break;
		default:
			monthName = "ERROR";
			
		}
		return monthName;
	
		}
}
