package oops_Encapsulation;

public class ReviewEncapsulation {

	String name = "Thuwaiba";
	String Id = "2040VA";
	private String employeeId = "20409";
	private int salary = 90000;
	
	void setEmployeeId(String setId) {
		this.employeeId = setId;
		
		}
	
	String getEmployeeId() {
		return employeeId;
	}


	static void arrayLearning(int a) {
		
		int[] myArray = new int[4];
		myArray[0]= 1;
		myArray[1]= 2;
		myArray[2]= 3;
		myArray[3]= 4;
		
		int length = myArray.length;
		System.out.println(length);
		System.out.println("printing the array by index: "+myArray[a]);
	}

}
