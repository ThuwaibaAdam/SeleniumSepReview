package lec8.java.sami;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		

		dividedByZero();
			
		}
		
		public static void dividedByZero(){
			//throws ArithmethicException{
		
			System.out.println(10/0);
		}
		
	public static void exceptionHandling() {

		int[] arr = {1,3,5,6};
		
		for(int i=0; i<= arr.length; i++) {
			
			try {
				System.out.println(arr[i]/0);
			}catch(ArrayIndexOutOfBoundsException aie) {
				System.out.println("you need to check you index");
			}catch(ArithmeticException ae) {
				System.out.println("you can't divide by 0.");
			throw ae;
			}
			catch(Exception e) {
				e.printStackTrace();
			}}
	}

}
