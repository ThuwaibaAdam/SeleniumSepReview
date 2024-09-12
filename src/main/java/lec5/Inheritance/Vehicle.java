package lec5.Inheritance;

public class Vehicle {

	public Vehicle(String typeOfVehicle, String typeOfEngine, String color, String manufacturer, String model ) {
		this.typeOfVehicle = typeOfVehicle;
		this.typeOfEngine = typeOfEngine;
		this.color = color;
		this.manufacturer = manufacturer;
		this.model = model;
	}
	String  typeOfVehicle;
	String typeOfEngine;
	String color;
	String manufacturer;
	String model;
	
	
	void accelerate() {
		System.out.println(typeOfVehicle + " is accelerating");
	}
	
	void deaccelerate() {
		System.out.println(typeOfVehicle + " is deacceleratin");
	}
	
	void turnOn() {
		System.out.println(typeOfVehicle + " is turning on");
	}
	
	void turnOff() {
		System.out.println(typeOfVehicle + " is turning off");
	}
	
}
