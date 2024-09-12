package lec4.learn.control_flow;

public class LearnConditionals {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 20;
		
		System.out.println(doSubstraction(x,y));
		
	}
	
	
	static int doSubstraction(int x, int y) {

		if(x > y) {
			return x-y;
		}else {
			return y-x;
		}
				
	}
}
