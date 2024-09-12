package lec5.Inheritance;

public class Dog extends Animal {

	Dog(String kind, String leg, String name , String age){
		super(kind, leg);
		this.name = name ;
		this.age = age;
	}
	String name;
	String age;
	
	void parking() {
		System.out.println("dog is parking");
	}
	
	void garding() {
		System.err.println("dog is garding");
	}
}
