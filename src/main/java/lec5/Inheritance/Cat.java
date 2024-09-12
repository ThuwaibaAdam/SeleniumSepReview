package lec5.Inheritance;

public class Cat extends Animal {

	Cat(String kind, String leg, String color, String feather){
		super(kind, leg);
		this.color = color;
		this.feather = feather;
		
	}
	String color;
	String feather;
	
	void scratching() {
		System.out.println("Cat is scratching");
	}
	
	void meawing() {
		System.out.println("Cat is meawing");
	}
}
