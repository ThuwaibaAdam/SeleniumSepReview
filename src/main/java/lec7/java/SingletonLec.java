package lec7.java;

public class SingletonLec {

	static SingletonLec singletonLec;
	
	private SingletonLec() {
		
		
		
	}
	
	public static SingletonLec getInstance() {
		
		if(singletonLec == null) {
			singletonLec = new SingletonLec();
		}
		
		return singletonLec;
	}
}
