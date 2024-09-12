package lec7.java;

public class TestSingleton {

	public static void main(String[] args) {
	
		SingletonLec obj = SingletonLec.getInstance();
		SingletonLec obj2 = SingletonLec.getInstance();
		SingletonLec obj3 = SingletonLec.getInstance();
		
		System.out.println(obj);
		System.out.println(obj2);
		System.out.println(obj3);
		
		String nameFrom = getName("Thuwaiba");
		System.out.println(nameFrom);
	}
	
	 static String getName(String name) {
		return name;
	}

}
