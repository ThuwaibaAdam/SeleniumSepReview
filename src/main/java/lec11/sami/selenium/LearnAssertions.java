package lec11.sami.selenium;

import org.junit.Test;
import org.junit.Assert;



public class LearnAssertions {

	/*
	 * public static void main(String[] args) {
	 * 
	 * LearnAssertions obj = new LearnAssertions(); int sum = obj.addition(33, 20);
	 * System.out.println(sum);
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	@Test
	void testAddition() {
		Assert.assertEquals(30, addition(10,20));
	}

	int addition(int num1, int num2) {
		return num1 + num2;
	}
}
