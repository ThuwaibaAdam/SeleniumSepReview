package lec5.Learn_controlFlow;

public class Exercise1 {

	public static void main(String[] args) {
		
		System.out.println(getDaysInMonth(9,2024));
		
	}

	
	public static int getDaysInMonth(int month, int year) {
		int numOfDays;
		
		if(month < 1 || month>12) {
			return -1;
		}
		
		if(year < 1 || year > 9999) {
			return -1;
		}
		
		switch(month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12: 
			numOfDays = 31;
			
		case 2: 
			numOfDays = 28;
			break;
		
		case 4:
		case 6:
		case 9:
		case 11: 
			numOfDays = 30;
			break;
		default:
			return -1;
		}
		
		
		return numOfDays;
	}
}
