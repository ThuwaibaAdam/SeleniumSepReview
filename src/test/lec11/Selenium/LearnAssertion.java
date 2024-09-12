package lec11.Selenium;



import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnAssertion {
	
	int addition(int num1, int num2) {
		return num1 + num2;
	}
	
	int subtraction(int num1, int num2) {
		if(num1>num2) {
			return num1-num2;
		}return num2 -num1;
	}
	
	int multioplication(int num1, int num2) {
		 return num1 * num2;
	}
	
	int division(int num1, int num2) {
		if(num1>num2) {
			return num1/num2;
		}return num2/ num1;
	}
	@Ignore
	@Test
	void testAddition() {
		Assert.assertEquals(30, addition(10,20));
	}
	
	@Test 
	void testSubtraction() {
		Assert.assertEquals(20, subtraction(30,50));
	}
	
	@Test 
	void testMultioplication() {
		Assert.assertEquals(30, multioplication(10,3));
	}
	
	@Test
	void testDivision() {
		Assert.assertEquals(2, division(10,5));
	}
	
	@BeforeClass
	public void runBeforeClass() {
		System.out.println("Before Class \n");
	}
	
	@BeforeTest
	public void runBeforeEachTest() {
		System.out.println("Before Test \n");
	}
	
	@BeforeMethod
	public void runBeforeEachMethod() {
		System.out.println("Before Method \n");
	}
	
	@AfterMethod
	public void runAfterEachMethod() {
		System.out.println("After Method \n");
	}
	
	@AfterTest
	public void runAfterEachTest() {
		System.out.println("After Test \n");
	}
	
	@AfterClass
	public void runAfterClass() {
		System.out.println("After Class \n");
	}

	
}
