package lec8.java.sami;

public class LearnMultiDimensionalArrays {

	public static void main(String[] args) {
		
		int[][] arr = new int[3][4];
		arr[0][0] = 4;
		arr[0][1] = 5;
		arr[0][2] = 6;
		arr[0][3] = 7;
		
		arr[1][0] = 1;
		arr[1][1] = 2;
		arr[1][2] = 3;
		arr[1][3] = 4;
		
		arr[2][0] = 3;
		arr[2][1] = 4;
		arr[2][2] = 5;
		arr[2][3] = 6;
				
		String[][] myArray = new String[2][2];
		
		myArray[0][0] = "Thuwaib";
		myArray[0][1] = "Student";
		
		myArray[1][0] = "Sara";
		myArray[1][1] = "Nurse";
				
		for(int i=0; i<myArray.length; i++) {
			for(int j=0; j< myArray.length;j++) {
				System.out.println(myArray[i][j]);
			}
		}
		
	}

}
