package lec7.java;

public class Test {

	public static void main(String[] args) {
	
		String name = "Zain";
		String name2 = "Zain";
		String name3 = new String("Zain");
		
		System.out.println(name.equals(name2));
		System.out.println(name == name2);
		System.out.println(name.equals(name3));
		System.out.println(name == name3);
	}

}
