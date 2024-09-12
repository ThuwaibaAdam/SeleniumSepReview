package intermediate.constructor;

public class TestConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car hyndai = new Car("hyndai", "elantra",2012);
		Car bmw = new Car("bmw","ms",2022);
		Car nissan = new Car("Nissan","altma",2017);
			
		System.out.println("year: "+ hyndai.year);
		System.out.println("Make: "+ hyndai.make);
		System.out.println("Modle: "+ hyndai.model);
		System.out.println("Type: "+Car.typeOfVehicle);
		System.out.println();
		System.out.println("year: "+ bmw.year);
		System.out.println("Make: "+ bmw.make);
		System.out.println("Modle: "+ bmw.model);
		System.out.println("Type: "+Car.typeOfVehicle);
		System.out.println();
		System.out.println("year: "+ nissan.year);
		System.out.println("Make: "+ nissan.make);
		System.out.println("Modle: "+ nissan.model);
		System.out.println("Type: "+Car.typeOfVehicle);

	}

}
