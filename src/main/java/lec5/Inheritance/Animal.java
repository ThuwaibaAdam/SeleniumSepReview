package lec5.Inheritance;

public class Animal {

	Animal(String kind, String leg){
		this.kind = kind;
		this.leg = leg;
	}
	
	String kind;
	String leg;
	
	void eat() {
		System.out.println("The animal"+kind+" is eating");
	}
	
	void sleep() {
		System.out.println("the animal is sleeping");
	}
}
