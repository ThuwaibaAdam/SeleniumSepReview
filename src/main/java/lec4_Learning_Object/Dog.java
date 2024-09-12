package lec4_Learning_Object;

public class Dog {

	int age ;
	String name;
	String breed;
	boolean isItVaccainated;
	 
	Dog(int age, String name, String breed, boolean isItVaccainated){
		this.age = age;
		this.name = name;
		this.breed = breed;
		this.isItVaccainated = isItVaccainated;
	}
	public void bark() {
		System.out.println("ho ho ho");
		
	}
	
	public void eat() {
		System.out.println("the dog is eating");
	}
	
}
