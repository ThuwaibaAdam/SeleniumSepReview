package lec8.java.sami;

import java.util.ArrayList;
import java.util.List;

public class LearnLists {

	public static void main(String[] args) {
	
		int[] myArray = new int[10];
		myArray[0] = 57;
		myArray[9] = 183;
		
		List <String> myList = new ArrayList();
		myList.add("Thuwaiba");
		myList.add("Sana");
		myList.add("Salma");
		myList.add("Saja");
		myList.add("Sogood");
		
		int length = myList.size();
		String name = myList.get(0);
		System.out.println(name);
		System.out.println(length);
		
		myList.add("Mohamed");
		
		System.out.println(myList.get(5));
		
		
		System.out.println(myList.contains("Saja"));
		
		List<String> subList = myList.subList(0, 3);
		for(String sub:subList) {
			System.out.println(sub);
		}
		
		System.out.println(subList.isEmpty());
		System.out.println(subList.size());
		
		
		
		
	}

}
