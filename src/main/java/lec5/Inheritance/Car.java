package lec5.Inheritance;

public class Car extends Vehicle{

	public Car(String typeOfVehicle, String typeOfEngine, String color, String manufacturer, String model,
		int numOfDoors,int numOfWheels, String typeOfTransmission, int numOfWindows,  int numOfSeats, int horspower	,int speed) {
		super(typeOfVehicle, typeOfEngine, color, manufacturer, model);
	this.numOfDoors = numOfDoors;
	this.numOfWheels =numOfWheels;
	this.typeOfTransmission = typeOfTransmission;
	this.numOfWindows = numOfWindows;
	this.numOfSeats = numOfSeats;
	this.horspower = horspower;
	this.speed = speed;
	}
	


	int numOfWheels;
	int numOfDoors;
	String typeOfTransmission;
	int numOfWindows;
	int numOfSeats;
	int horspower;
	int speed;
	


	@Override
	void accelerate() {
		System.out.println("Speed: " + speed);
	}
	
	void turnLeft() {
		System.out.println("Car is turning left");
	}
	
	void turnRight() {
		System.out.println("Car is turning right");
	}
	
	void trunOnHeadLight() {
		System.out.println("Car's headlights are on");
	}
	
	void trunOffHeadLight() {
		System.out.println("Car's headlights are off");
	}
	
	void indicateRightTurn() {
		System.out.println("Car's right indicater if blinking");
	}
	
	void indicateLeftTurn() {
		System.out.println("Car's right indicater if blinking");
	}
}
