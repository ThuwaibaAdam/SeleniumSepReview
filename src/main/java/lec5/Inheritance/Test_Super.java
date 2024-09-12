package lec5.Inheritance;

public class Test_Super {

	public static void main(String[] args) {
		
		Animal horse = new Animal("horse", "4");
		horse.eat();
		
		
		Cat garfin = new Cat("Cat","4","white","yes");
		garfin.sleep();
		garfin.scratching();
		System.out.println(garfin.color);
		
		Animal lux = new Dog("Dog", "4", "lux", "3");
		lux.eat();

	}

}
