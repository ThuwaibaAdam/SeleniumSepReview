package lec8.java.sami;

import java.util.Stack;

public class LearnStack {

	public static void main(String[] args) {
		
		Stack<Integer> myStack = new Stack<>();

		myStack.push(10);
		myStack.push(20);
		myStack.push(30);
		myStack.push(40);
		
		System.out.println(myStack.peek());
		int poppedElement = myStack.pop();
		System.out.println(myStack.peek());
	}

}
