package lec8.java.sami;

import java.util.HashMap;
import java.util.Map;

public class LearnQueue {

	public static void main(String[] args) {
		
		Map<Integer, String > days = new HashMap();
		
		days.put(1, "Sunday");
		days.put(2, "Monday");
		days.put(3, "Tuesday");
		days.put(4, "Wednesday");
		days.put(5, "Thursday");
		days.put(6, "Friday");
		days.put(7, "Saturday");
		
		
		for(int key:days.keySet()) {
			System.out.println("KEY: "+ key);
			System.out.println("VALUE: "+days.get(key));
		}
		
		/*
		 * int size = days.size(); System.out.println(size);
		 * 
		 * System.out.println(days.get(1)+ "\n"+ days.get(7));
		 * 
		 * System.out.println(days); System.out.println(days.entrySet());
		 * System.out.println(days.keySet()); System.out.println(days.values());
		 */
	}

}
