package lec7.java;

public class TestEnum {

	public static void main(String[] args) {
	
		Months[] array =Months.values();
		
		for(Months month : array) {
			System.out.println(month);
		}
		System.out.println(Months.FEBRUARY);
		System.out.println("______________");
		System.out.println(Months.valueOf("AUGUST"));

	}

}
