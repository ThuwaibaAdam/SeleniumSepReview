package focus_Lec_2;

public class Method_Return_Type {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(add(9,12));
		int sum = add(10, 25);
		System.out.println(sum);
		int multi = 10 * add(5,15);
		System.out.println(multi);
	}
	
	// two type of method:
	// 1. void
	// 2. return 
	
	// with the return: we can perform an action with the value returned
	// declaring an item means holding a memory for it.
	// parameter are the data that the method accept.
	// argument are the value we pass in the calling of the  method.
	// static are  belong to the class not the instance of the class
	
	
	static int add(int a, int b) {
		return a+b;
	}

}
