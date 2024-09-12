package testPackage_lec2;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		Dog fido = new Dog();
		Dog airBud = new Dog();
		
		fido.breed = "goldenRetriver";
		airBud.breed = "German";
		
		System.out.println(fido.breed );
		System.out.println(airBud.breed);
		airBud.typeOFAnimal = "Giraffi";
		System.out.println(fido.typeOFAnimal);
		System.out.println(airBud.typeOFAnimal);
	}

}
