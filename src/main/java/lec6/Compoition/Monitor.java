package lec6.Compoition;

public class Monitor {
	
	public Monitor(String manufacturer, int volLevel) {
		this.manufacturer = manufacturer; 
		this.volLevel = volLevel;
		
	}
	
	
	String manufacturer;
	 static int volLevel;
	
	
	public static void main(String[] args) {
		
		increaseVol(50);
		
		
	}
	void powerOff() {
		System.out.println(this.manufacturer + "monitor is powering Off");
	}

	void sleep() {
		System.out.println(this.manufacturer + "monitor is going to sleep");
	}
	
	static void increaseVol(int increaseBy) {
		
		for(int i = 0; i<= increaseBy; i++) {
			System.out.println("Volum is "+ i);
		}
		volLevel = volLevel + increaseBy;
		System.out.println("Volume is set to "+ volLevel);
	}
	
}
